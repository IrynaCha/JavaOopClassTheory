package secondPdf.inheritanceExamples.subclassConstructor;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Alpha {
    String name; // Текстовое поле
    int code; // Целочисленное поле

    Alpha(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - " + this.name);
        System.out.println("Поле code - " + this.code);
    }

    Alpha(String name) {
        this(name, 0);
    }

    Alpha(int code) {
        this("Белый", code);
    }

    Alpha() {
        this("Желтый", 1);
    }
}