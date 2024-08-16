package Java_David_J_Eck.chapter5_OOP_Objects;

/**
 * An object of type Deck represents a deck of playing cards.  The deck
 * is a regular poker deck that contains 52 regular cards and that can
 * also optionally include two Jokers.
 */
public class Deck {

    /**
     * An array of 52 or 54 cards. A 54-card deck contains two jokers, in
     * addition to the 52 cards of a regular poker deck.
     */
    private Card[] deck;

    /**
     * Keeps track of the number of cards that have been dealt from the desk
     * so far.
     */
    private int cardsUsed;

    /**
     * Constructs a regular 52-card poker deck.  Initially, the cards
     * are in a sorted order.  The shuffle() method can be called to
     * randomize the order.  (Note that "new Deck()" is equivalent
     * to "new Deck(false)".)
     */
    public Deck() {
        this(false);    // Just call the other constructor in this class.
    }

    /**
     * Constructs a poker deck of playing cards, The deck contains
     * the usual 52 cards and can optionally contain two Jokers
     * in addition, for a total of 54 cards.   Initially the cards
     * are in a sorted order.  The shuffle() method can be called to
     * randomize the order.
     *
     * @param includeJokers if true, two Jokers are included in the deck; if
     *                      false,
     *                      there are no Jokers in the deck.
     */
    public Deck(boolean includeJokers) {
        if (includeJokers)
            deck = new Card[54];
        else
            deck = new Card[52];
        int cardCount = 0; // How many cards have been created so far.
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[cardCount] = new Card(value, suit);
                cardCount++;
            }
        }
        if (includeJokers) {
            deck[52] = new Card(1, Card.JOKER);
            deck[53] = new Card(2, Card.JOKER);
        }

        /*
         * Final State of the Deck
         * After all iterations are complete, the deck array will be filled as
         * follows:
         * deck[0] = new Card(1, 0) // Ace of SPADES
         * deck[1] = new Card(2, 0) // 2 of SPADES
         * ...
         * deck[12] = new Card(13, 0) // King of SPADES
         * deck[13] = new Card(1, 1) // Ace of HEARTS
         * ...
         * deck[25] = new Card(13, 1) // King of HEARTS
         * ...
         * deck[38] = new Card(13, 2); // King of DIAMONDS
         * ...
         * deck[51] = new Card(13, 3) // King of CLUBS
         *
         * Position Calculation
         * Spades:
         * Cards: 1 (Ace) to 13 (King)
         * Positions: 0 to 12 (total 13 cards)
         * Hearts:
         * Cards: 1 (Ace) to 13 (King)
         * Positions: 13 to 25 (total 13 cards)
         * Diamonds:
         * Cards: 1 (Ace) to 13 (King)
         * Positions: 26 to 38 (total 13 cards)
         * Clubs:
         * Cards: 1 (Ace) to 13 (King)
         * Positions: 39 to 51 (total 13 cards)
         * * */
    }

    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     * The shuffle method effectively randomizes the order of the cards in
     * the deck array using the Fisher-Yates shuffle algorithm. It iterates
     * through the deck in reverse, swapping each card with a randomly
     * selected card from the portion of the deck that has not yet been
     * shuffled. Finally, it resets the cardsUsed counter to indicate that
     * all cards are available for future use.
     */
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));  // the random
            // index can be any of the indices from the start of the array up
            // to the current index i.
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        cardsUsed = 0;

        /*
         * Range of Random Numbers:
         * Math.random() generates a floating-point number in the range [0.0, 1
         * .0), meaning it can be 0 but will never reach 1.
         * By multiplying this value by (i + 1), you scale the range to [0, i +
         *  1). This means the possible values for rand will be from 0 to i
         * (inclusive).
         * Why i + 1?:
         * If i is 4, then (i + 1) equals 5. The expression Math.random() * (i
         * + 1) will yield a number in the range [0, 5).
         * When you cast this to an int, it effectively gives you a random
         * integer from 0 to 4, which are valid indices for an array of
         * length 5.
         * */
    }

    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases.  This function returns the number of cards that
     * are still left in the deck.  The return value would be
     * 52 or 54 (depending on whether the deck includes Jokers)
     * when the deck is first created or after the deck has been
     * shuffled.  It decreases by 1 each time the dealCard() method
     * is called.
     */
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the cardsLeft() function.
     *
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card dealCard() {
        if (cardsUsed == deck.length) {
            throw new IllegalStateException("No cards are left in the deck.");
        }
        cardsUsed++;    // keeps track of how many cards have been dealt from
        // the deck.
        return deck[cardsUsed - 1]; // returns the card that was just dealt.
        // Since cardsUsed was incremented before this line, cardsUsed - 1
        // gives the index of the card that is currently being dealt. For
        // example, if cardsUsed is now 1, it returns deck[0], which is the
        // first card.

        // Programming note:  Cards are not literally removed from the array
        // that represents the deck.  We just keep track of how many cards
        // have been used.
    }

    /**
     * Test whether the deck contains Jokers.
     *
     * @return true, if this is a 54-card deck containing two jokers, or
     * false if
     * this is a 52 card deck that contains no jokers.
     */
    public boolean hasJokers() {
        return (deck.length == 54);
    }

}   // end of class Deck
