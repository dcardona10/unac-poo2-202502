package co.edu.unac.oop2.figures;

public class Triangle extends Figure {

    private double height;

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
