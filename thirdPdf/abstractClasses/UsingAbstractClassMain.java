package thirdPdf.abstractClasses;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
public class UsingAbstractClassMain {
    public static void main(String[] args) {
        Triangle T = new Triangle("красный", 2);
        Square S = new Square("черный", 3);
        Circle C = new Circle("желтый", 1);
        System.out.println("Использование объектных переменных подкласса");
        T.show();
        S.show();
        C.show();
        ColoredFigure F;
        System.out.println("Using объектной переменной абстрактного суперкласса");
        F = T; // Треугольник
        F.show();
        F = S; // Квадрат
        F.show();
        F = C; // Круг
        F.show();
    }
}