package secondPdf.polymorphismExamples.moreOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Bravo extends Alpha {
    int code;

    void show() {
        super.show(); // Вызов версии метода из суперкласса
        System.out.println("Числовое поле " + code);
    }

    Bravo(String name, int code) {
        super(name); // Вызов конструктора суперкласса
        this.code = code;
    }
}