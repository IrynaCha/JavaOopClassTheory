package thirdPdf.abstractClasses;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
class Circle extends ColoredFigure {
    Circle(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "круг";
    }

    double getArea() {
        double k = Math.PI;
        return size * size * k;
    }

    String getSizeName() {
        return "радиус";
    }
}