package co.edu.unac.oop2.figures;

public abstract class Figure {

    protected double base;
    private String data;

    public abstract double getArea();

    public void showFigureData() {
        System.out.println(data);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
