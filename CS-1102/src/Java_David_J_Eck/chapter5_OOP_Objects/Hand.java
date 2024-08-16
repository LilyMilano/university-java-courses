package Java_David_J_Eck.chapter5_OOP_Objects;

import java.util.ArrayList;

/**
 * An object of type Hand represents a hand of cards.  The
 * cards belong to the class Card.  A hand is empty when it
 * is created, and any number of cards can be added to it.
 */
public class Hand {

    private ArrayList<Card> hand;   // The cards in the hand.

    /**
     * Create a hand that is initially empty.
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }

    /**
     * Remove all cards from the hand, leaving it empty.
     */
    public void clear() {
        hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     *
     * @param c the non-null card to be added.
     * @throws NullPointerException if the parameter c is null.
     */
    public void addCard(Card c) {
        if (c == null) {
            throw new NullPointerException("Can't add a null card to a hand.");
        }
        hand.add(c);
    }

    /**
     * Remove a card from the hand, if present.
     *
     * @param c the card to be removed. If c is null or if the card is not in
     *          the hand, then nothing is done.
     */
    public void removeCard(Card c) {
        hand.remove(c);
    }

    /**
     * Remove the card in a specified position from the hand.
     *
     * @param position the position of the card that is to be removed, where
     *                 positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     *                                  the hand, that is if the position is
     *                                  less than 0 or greater than
     *                                  or equal to the number of cards in
     *                                  the hand.
     */
    public void removeCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException(" Position does not exist in " +
                    "hand: " + position);
        hand.remove(position);
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     *
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Position does not exist in " +
                    "hand " + position);
        return hand.get(position);
    }

    /**
     * Sorts the cards in the hand so that cards of the same suit are
     * grouped together, and within a suit the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     * The sortBySuit method sorts the cards in a player's hand by grouping
     * them according to their suits and sorting them by their values within
     * each suit. The algorithm works by repeatedly finding the card with the
     * minimum suit and value, removing it from the original hand, and adding
     * it to a new sorted hand. This process continues until all cards have
     * been moved to the new hand, which is then assigned back to the
     * original hand variable.
     */
    public void sortBySuit() {
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;    // Position of minimal card.
            Card c = hand.get(0);   // Minimal card.
            for (int i = 1; i < hand.size(); i++) {    // This loop iterates
                // through the remaining cards in the hand, starting from
                // index 1.
                Card c1 = hand.get(i);  // retrieves the current card being
                // compared.
                if (c1.getSuit() < c.getSuit() || (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue())) {
                    // The condition checks if c1 has a lower suit than c or
                    // if they have the same suit but c1 has a lower value
                    // than c.
                    pos = i;    //  If either condition is true, it updates
                    // pos to the current index i
                    c = c1; // and sets c to c1,
                    // indicating that a new minimum card has been found.
                }
            }
            hand.remove(pos);   // removes the card at the position pos from
            // the hand, effectively taking it out of the original list.
            newHand.add(c); // adds the found minimal card c to the newHand,
            // which is being built as the sorted list.
        }
        hand = newHand; // Update Hand: After all cards have been processed
        // and sorted into newHand, this line assigns newHand back to hand,
        // effectively replacing the original unsorted hand with the sorted one.
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by suit.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;    //Position of minimal card.
            Card c = hand.get(0);   // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if (c1.getValue() < c.getValue() || (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit())) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }

}   // end of class Hand
