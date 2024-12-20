public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // building my constructor//
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true; // making in available by default here//
    }

    // my getters and setters for gaining access to the private//
    public String getVehicleId() {
        return vehicleId; }

    public String getModel() {
        return model; }

    public double getBaseRentalRate() {
        return baseRentalRate; }

    public boolean isAvailable() {
        return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available; }

    // Abstraction for the methods//
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();
}



