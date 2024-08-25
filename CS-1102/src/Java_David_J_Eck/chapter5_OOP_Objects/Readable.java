package Java_David_J_Eck.chapter5_OOP_Objects;

public interface Readable { // represents a source of input.

    public char readChar(); // Abstract method. Read the next character from

    // the input.
    default public String readLine() {  // read up to the next line feed.
        StringBuilder line = new StringBuilder();
        char ch = readChar(); // Polymorphic. Default method calls the abstract
        // method.
        while (ch != '\n') {
            line.append(ch);
            ch = readChar(); // Polymorphic. Default method calls the abstract
            // method.
        }
        return line.toString();
    }   // end of default readLine() method

    /*
    The Readable interface defines a method to read characters and
    provides a default method to read an entire line.

    A concrete class that implements this interface must provide an
    implementation for readChar(). It will inherit a definition for readLine
    () from the interface, but can provide a new definition if necessary.
    When a class includes an implementation for a default method, the
    implementation given in the class overrides the default method from the interface.
    Note that the default readLine() calls the abstract method readChar(),
    whose definition will only be provided in an implementing class. The
    reference to readChar() in the definition is polymorphic.
    The default implementation of readLine() is one that would make sense in
    almost any class that implements Readable.*/

}   // end of Readable interface
