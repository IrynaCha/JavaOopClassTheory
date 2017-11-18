package secondPdf.polymorphismExamples.overrideMethod;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Bravo extends Alpha { // Подкласс
    int code; // Целочисленное поле

    // Переопределение метода. Новой версией метода отображаются значения двух полей:
    void show() {
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - " + name);
        System.out.println("Поле code - " + code);
    }

    // Конструктор класса:
    Bravo(String name, int code) {
// Вызов конструктора суперкласса:
        super(name);
        this.code = code;
    }
}