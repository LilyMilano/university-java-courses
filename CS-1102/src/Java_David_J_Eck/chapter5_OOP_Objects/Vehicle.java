package Java_David_J_Eck.chapter5_OOP_Objects;

/**
 * Superclass representing a vehicle.
 */
public class Vehicle {
    int registrationNumber; // Instance variable for vehicle registration number
    Person owner;   // Instance variable for the owner of the vehicle (object
    // of type Person).

    // Constructor to initialize a Vehicle object with registration number
    // and owner:
    public Vehicle(int registrationNumber, Person owner) {
        this.registrationNumber = registrationNumber;   // 'this
        // .registrationNumber refers to the instance variable.
        this.owner = owner; // 'this.owner' refers to the instance variable,
        // which is an object of type Person.
    }

    // Method to transfer ownership od the vehicle:
    public void transferOwnerShip(Person newOwner) {
        this.owner = newOwner;  // Update the owner to the new owner.
        System.out.println("Ownership transferred to: " + newOwner.name);
        // Print confirmation
    }

    // Method to display vehicle info (can be overridden)
    public void displayInfo() {
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Owner: " + owner.name);
    }

}   // end of class Vehicle