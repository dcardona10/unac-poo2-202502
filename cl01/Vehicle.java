public class Vehicle {

    public String engine;
    public int engineSize;
    public int wheelNumber;
    public String maker;
    public String model;
    public int year;

    public boolean isElectricOrHybrid() {
        return this.engine.startsWith("E") || this.engine.startsWith("H");
    }

    public void showCarCharacteristics() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", engineSize=" + engineSize +
                ", wheelNumber=" + wheelNumber +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
