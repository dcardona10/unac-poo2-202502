package co.edu.unac.oop2.figures;

public class Rectangle extends Figure {

    private double height;

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
