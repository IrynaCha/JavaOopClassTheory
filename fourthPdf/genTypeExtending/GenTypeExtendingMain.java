package fourthPdf.genTypeExtending;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class GenTypeExtendingMain {
    public static void main(String[] args) {
// Объекты создаются на основе обобщенного класса:
        MyClass<Alpha> A = new MyClass<>(new Alpha("Alpha", 123));
        MyClass<Bravo> B = new MyClass<>(new Bravo("Bravo", 321, 'B'));
// Вызов метода show() из объектов:
        A.show();
        B.show();
    }
}
