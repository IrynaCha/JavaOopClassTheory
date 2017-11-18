package secondPdf.toStringUsage;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class MyClass {
    String name; // Текстовое поле
    int code; // Целочисленное поле

    MyClass(String txt, int num) { // Конструктор
        name = txt;
        code = num;
    }

    // Переопределение метода toString():
    public String toString() {
        String txt = "Объект класса MyClass\n"; // Локальная текстовая переменная
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
// Импровизированная "линия":
        for (int k = 1; k <= 21; k++) {
            txt += "-";
        }
        return txt; // Результат метода
    }
}