package co.edu.unac.oop2.vehicles;

public class Truck extends Vehicle {

    private static final double TRUCK_MAINTENANCE_FEE = 700000;
    private static final double TRUCK_AGE_FEE = 60000;

    private double loadCapacity;

    @Override
    public double calculateMaintenanceRate() {
        return TRUCK_MAINTENANCE_FEE + (TRUCK_AGE_FEE * this.getVehicleAge());
    }

    @Override
    public void showInfo() {
        System.out.println("Truck: [Maker: "
        + this.maker + ", Model: "
        + this.model + ", Year: "
        + this.year + ", Load Capacity: "
        + this.loadCapacity + "]");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
