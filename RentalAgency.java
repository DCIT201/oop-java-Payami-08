import java.util.ArrayList;
//RENTALAGNECY//
public  class RentalAgency  {
    private ArrayList<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.rent(customer, days);
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.returnVehicle();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public void generateReport() {
        System.out.println("Vehicle Fleet Report:");
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle.getModel() + " - Available: " + vehicle.isAvailable());
        }
    }
}

