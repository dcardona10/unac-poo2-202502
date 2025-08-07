package co.edu.unac.oop2.vehicles;

public class Motorcycle extends Vehicle {

    private static final double MOTORCYCLE_MAINTENANCE_FEE = 300000;
    private static final double MOTORCYCLE_AGE_FEE = 20000;

    private int displacement;

    @Override
    public double calculateMaintenanceRate() {
        return MOTORCYCLE_MAINTENANCE_FEE + (MOTORCYCLE_AGE_FEE * this.getVehicleAge());
    }

    @Override
    public void showInfo() {
        System.out.println("Motorcycle: [Maker: "
        + this.maker + ", Model: "
        + this.model + ", Year: "
        + this.year + ", Displacement: "
        + this.displacement + "]");
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
