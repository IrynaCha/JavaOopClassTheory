package thirdPdf.abstractClasses;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
abstract class ColoredFigure { // Абстрактный суперкласс
    String color;
    int size;

    ColoredFigure(String clr, int s) {
        this.color = clr;
        this.size = s;
    }

    void show() {
        System.out.println("Фигура: " + color + " " + getName());
        System.out.println("Характерный размер (" + getSizeName() + "): " + size);
        System.out.printf("Площадь: %.3f\n", getArea());

        String line = "";
        for (int k = 1; k <= 30; k++) {
            line += "*";
        }
        System.out.println(line);
    }

    String getSizeName() {
        return "сторона";
    }

    // Абстрактные методы:
    abstract String getName();

    abstract double getArea();
}