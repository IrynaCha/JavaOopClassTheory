package secondPdf.inheritanceExamples.superAndSub;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Bravo extends Alpha {
    int code; // Целочисленное поле

    void show() { // Переопределение метода
        String txt = "Объект класса Bravo\n"; // Локальная текстовая переменная
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        } // Отображение сообщения:
        System.out.println(txt);
    }
}