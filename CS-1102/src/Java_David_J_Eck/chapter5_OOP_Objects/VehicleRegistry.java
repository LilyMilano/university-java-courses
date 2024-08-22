package Java_David_J_Eck.chapter5_OOP_Objects;

/**
 * Main class to demonstrate the functionality of the vehicle classes.
 */
public class VehicleRegistry {

    public static void main(String[] args) {

        // Creating Person objects (instances of Person class):
        Person owner1 = new Person("Alice Noelle"); // 'owner1' is an object
        // of type Person.
        Person owner2 = new Person("Katie Brown");  // 'owner2' is another
        // object of type Person.

        // Creating Vehicle objects (instances of subclasses):
        Vehicle myCar = new Car(1234, owner1, 4);   // 'myCar' is an object
        // of type Car.
        Vehicle myTruck = new Truck(1235, owner2, 6);   // 'myTruck' is an
        // object of type Truck.
        Vehicle myMotorcycle = new Motorcycle(1236, owner1, false); //
        // 'myMotorcycle' is an object of type Motorcycle.

        // Display initial vehicle information:
        displayVehicleInfo(myCar);    // Call method to print info for myCar
        displayVehicleInfo(myTruck);  // Call method to print info for myTruck
        displayVehicleInfo(myMotorcycle); // Call method to print info for
        // myMotorcycle

        // Transfer ownership of myCar to owner2
        myCar.transferOwnerShip(owner2);    // Transfer ownership
        displayVehicleInfo(myCar);    // Print updated info for myCar

        /* Output:
        * Registration number: 1234
        * Owner: Alice Noelle
        * Type of Vehicle: Car
        * Number of doors: 4
        *
        * Registration number: 1235
        * Owner: Katie Brown
        * Type of Vehicle: Truck
        * Number of axles: 6
        *
        * Registration number: 1236
        * Owner: Alice Noelle
        * Type of vehicle: Motorcycle
        * Has a sidecar: false
        *
        * Ownership transferred to: Katie Brown
        * Registration number: 1234
        * Owner: Katie Brown
        * Type of Vehicle: Car
        * Number of doors: 4
        *
        *
        * Process finished with exit code 0*/

    }   // end of main()

    /**
     * Method to display information about a vehicle
     */
    static void displayVehicleInfo(Vehicle myVehicle) {
        // Call the displayInfo method which is overridden in subclasses
        myVehicle.displayInfo();

        // Pattern Matching: The displayVehicleInfo method demonstrates the
        // use of pattern matching with instanceof to simplify type checking
        // and casting.
        // Check the type of vehicle and print specific information:
        // Pattern matching for instanceof. Pattern matching makes
        //it possible to include declaration and initialization of a variable
        // in an instanceof test.
        if (myVehicle instanceof Car myCar) {   // This checks if myVehicle is
            // an instance of Car and, if true, automatically casts it to
            // Car, assigning it to the variable myCar. This eliminates the
            // need for a separate cast statement.
            System.out.println("Type of Vehicle: Car"); // Print vehicle type
            System.out.println("Number of doors: " + myCar.numberOfDoors);
            // Print number of doors
        } else if (myVehicle instanceof Truck myTruck) {    // myTruck is
            // automatically cast to Truck
            System.out.println("Type of Vehicle: Truck");
            System.out.println("Number of axles: " + myTruck.numberOfAxles);
        } else if (myVehicle instanceof Motorcycle myCycle) {   // myCycle is
            // automatically cast to Motorcycle
            System.out.println("Type of vehicle: Motorcycle");
            System.out.println("Has a sidecar: " + myCycle.hasSidecar); //
            // Print sidecar status
        } else {
            System.out.println("Unknown vehicle type.");    // Catch-all for
            // any other types.
        }
        System.out.println();   // For better readability

    }   // end of printVehicleInfo()
}   // end of VehicleRegistry class
