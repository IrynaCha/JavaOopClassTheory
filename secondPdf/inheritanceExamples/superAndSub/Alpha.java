package secondPdf.inheritanceExamples.superAndSub;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Alpha { // Суперкласс
    String name; // Текстовое поле

    void show() { // Метод для отображения значения поля
        String txt = "Объект класса Alpha\n"; // Локальная текстовая переменная
        txt += "Поле name: " + name + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        } // Отображение сообщения:
        System.out.println(txt);
    }
}