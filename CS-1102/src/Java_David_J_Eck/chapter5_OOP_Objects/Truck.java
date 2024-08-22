package Java_David_J_Eck.chapter5_OOP_Objects;

/** Subclass representing a truck, which is a type of vehicle. */
public class Truck extends Vehicle {

    int numberOfAxles;  // Instance variable for the number of axles in the
    // truck.

    // Constructor to initialize a Truck object with registration number,
    // owner, and numberOfAxles:
    public Truck (int registrationNumber, Person owner, int numberOfAxles) {
        super(registrationNumber, owner);   // Calls the constructor of the
        // superclass Vehicle.
        this.numberOfAxles = numberOfAxles; // 'this.numberOfAxles' refers
        // to the instance variable.
    }
}   // end of class Truck
