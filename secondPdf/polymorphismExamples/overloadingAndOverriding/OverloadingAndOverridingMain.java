package secondPdf.polymorphismExamples.overloadingAndOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class OverloadingAndOverridingMain {
    public static void main(String[] args) { // Главный метод
        Alpha objA = new Alpha(); // Создание объекта суперкласса
        objA.show(); // Вызов разных версий метода
        objA.show("Объект objA");
        Bravo obj = new Bravo(); // Создание объекта подкласса
        obj.show(); // Вызов разных версий метода
        obj.show("Объект objB");
        obj.show(123);
    }
}
