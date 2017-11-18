package secondPdf.polymorphismExamples.overrideMethod;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Alpha { // Суперкласс
    String name; // Текстовое поле

    void show() { // Метод для отображения значения текстового поля
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name - " + name);
    }

    Alpha(String name) { // Конструктор класса
        this.name = name;
    }
}