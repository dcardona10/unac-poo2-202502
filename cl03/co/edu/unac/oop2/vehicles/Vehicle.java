package co.edu.unac.oop2.vehicles;

import java.util.Calendar;
import java.util.Date;

public abstract class Vehicle {

    protected String maker;
    protected String model;
    protected int year;

    public abstract double calculateMaintenanceRate();
    public abstract void showInfo();

    protected int getVehicleAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
