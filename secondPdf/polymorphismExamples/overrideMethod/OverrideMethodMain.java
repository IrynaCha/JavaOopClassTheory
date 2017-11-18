package secondPdf.polymorphismExamples.overrideMethod;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
// Главный класс:
public class OverrideMethodMain {
    // Главный метод:
    public static void main(String[] args) {
// Создание объекта суперкласса:
        Alpha objA = new Alpha("objA");
// Создание объекта подкласса:
        Bravo objB = new Bravo("objB", 123);
// Вызов метода из объекта суперкласса:
        objA.show();
// Вызов метода из объекта подкласса:
        objB.show();
    }
}