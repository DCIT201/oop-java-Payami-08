public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Adding of the vehicles//
        agency.addVehicle(new Car("C001", "Toyota Corolla", 50));
        agency.addVehicle(new Motorcycle("M001", "Yamaha R1", 30));
        agency.addVehicle(new Truck("T001", "Ford F-150", 100));

        // Creating a customer//
        Customer customer = new Customer("John Doe", "123-456-7890");

        // Renting and returning vehicles//
        agency.rentVehicle("C001", customer, 5); // Rent car
        agency.returnVehicle("C001");           // Return car

        agency.rentVehicle("T001", customer, 3); // Rent truck
        agency.returnVehicle("T001");           // Return truck

        // the report from the agency//
        agency.generateReport();
    }
}
