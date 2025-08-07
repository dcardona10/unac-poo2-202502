package co.edu.unac.oop2.vehicles;

public class Car extends Vehicle {

    private static final double CAR_MAINTENANCE_FEE = 500000;
    private static final double CAR_AGE_FEE = 40000;

    private int doors;

    @Override
    public double calculateMaintenanceRate() {
        return CAR_MAINTENANCE_FEE + (CAR_AGE_FEE * this.getVehicleAge());
    }

    @Override
    public void showInfo() {
        System.out.println("Car: [Maker: "
        + this.maker + ", Model: "
        + this.model + ", Year: "
        + this.year + ", Doors: "
        + this.doors + "]");
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
