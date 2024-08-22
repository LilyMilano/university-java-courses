package Java_David_J_Eck.chapter5_OOP_Objects;

/** Subclass representing a motorcycle, which is a type of vehicle. */
public class Motorcycle extends Vehicle {
    boolean hasSidecar; // Instance variable indicating if the motorcycle has
    // a sidecar.

    // Constructor to initialize a Motorcycle object with registration
    // number, owner, and sidecar status:
    public Motorcycle (int registrationNumber, Person owner,
                       boolean hasSidecar) {
        super(registrationNumber, owner); // Call the constructor of the
        // superclass Vehicle.
        this.hasSidecar = hasSidecar;   // 'this.hasSidecar' refers to the
        // instance variable
    }
}   // end of class Motorcycle
