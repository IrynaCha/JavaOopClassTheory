package thirdPdf.abstractClasses;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
class Square extends ColoredFigure {
    Square(String clr, int s) {
        super(clr, s);
    }

    String getName() {
        return "квадрат";
    }

    double getArea() {
        double k = 1;
        return size * size * k;
    }
}