package secondPdf.polymorphismExamples.virtualMethods;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class VirtualMethodsMain {
    // Главный метод:
    public static void main(String[] args) {
// Создание объекта суперкласса:
        Alpha objA = new Alpha("alpha");
// Отображение значения поля:
        objA.show();
// Создание объекта подкласса:
        Bravo objB = new Bravo("bravo");
// Отображение значения поля:
        objB.show();
    }
}
