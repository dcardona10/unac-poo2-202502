package co.edu.unac.oop2.figures;

public class Circle extends Figure {

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.base, 2);
    }
}
