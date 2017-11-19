package fourthPdf.usingGenMethods;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class UsingGenMethodsMain {
    public static void main(String[] args) { // Главный метод
        MyClass A = new MyClass("Объект A"); // Создание объектов
        MyClass B = new MyClass("Объект B");
        A.show(123); // Вызов обобщенных методов из разных объектов
        A.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show('B');
    }
}
