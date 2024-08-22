package Java_David_J_Eck.chapter5_OOP_Objects;

/** Subclass representing a car, which is a type of vehicle. */
public class Car extends Vehicle {
    int numberOfDoors;  // Instance variable for the number of doors in the car.

    // Constructor to initialize a Car object with registration number,
    // owner, and numberOfDoors:
    public Car (int registrationNumber, Person owner, int numberOfDoors) {
        super(registrationNumber, owner);   // Call the constructor of the
        // superclass (Vehicle)
        this.numberOfDoors = numberOfDoors; // 'this.numberOfDoors' refers to
        // the instance variable.
    }
}   // end of class Car.
