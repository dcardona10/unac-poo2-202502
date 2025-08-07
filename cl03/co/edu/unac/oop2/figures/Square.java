package co.edu.unac.oop2.figures;

public class Square extends Figure {

    @Override
    public double getArea() {
        return Math.pow(this.base, 2);
    }
}
