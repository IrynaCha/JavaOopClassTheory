package thirdPdf.abstractClasses;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
class Triangle extends ColoredFigure {
    Triangle(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "треугольник";
    }

    double getArea() {
        double k = Math.sqrt(3) / 4;
        return size * size * k;
    }
}