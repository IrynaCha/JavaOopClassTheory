package thirdPdf.interfaces.defaultMethods;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class DefaultMethodsMain {
    public static void main(String[] args) {
        Base ref; // Интерфейсная переменная
        Alpha objA = new Alpha(); // Объект класса Alpha
        // Вызов методов через объектную переменную:
        objA.hello();
        objA.show("объектная переменная objA");
        // Интерфейсной переменной присваивается ссылка на объект класса Alpha:
        ref = objA;
        // Вызов метода через интерфейсную переменную:
        ref.show("интерфейсная переменная ref");
        Bravo objB = new Bravo(); // Объект класса Bravo
        // Вызов методов через объектную переменную:
        objB.hello();
        objB.show("объектная переменная objB");
        // Интерфейсной переменной присваивается ссылка на объект класса Bravo:
        ref = objB;
        // Вызов метода через интерфейсную переменную:
        ref.show("интерфейсная переменная ref");
    }
}
