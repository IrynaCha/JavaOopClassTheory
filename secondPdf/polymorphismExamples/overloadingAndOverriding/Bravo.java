package secondPdf.polymorphismExamples.overloadingAndOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Bravo extends Alpha {
    void show() { // Переопределение версии метода без аргументов
        System.out.println("Класс Bravo");
    }

    void show(int num) { // Версия метода с целочисленным аргументом
        System.out.println("Число " + num);
    }
}