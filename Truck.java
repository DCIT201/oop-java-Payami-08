public class Truck extends Vehicle implements Rentable {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(getModel() + " truck rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println(getModel() + " truck is not available for rental.");
        }
    }
    //overriding here to//
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(getModel() + " truck has been returned.");
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * getBaseRentalRate()) + 50; // Additional flat fee for trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
