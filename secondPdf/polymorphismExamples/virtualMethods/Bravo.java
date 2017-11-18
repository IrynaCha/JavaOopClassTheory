package secondPdf.polymorphismExamples.virtualMethods;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Bravo extends Alpha { // Подкласс
    // Переопределение метода:
    void objectCreated() {
        System.out.println("Создан объект класса Bravo");
    }

    // Переопределение метода:
    void hello() {
        System.out.println("Объект класса Bravo");
    }

    // Конструктор:
    Bravo(String txt) {
// Вызов конструктора суперкласса:
        super(txt);
    }
}