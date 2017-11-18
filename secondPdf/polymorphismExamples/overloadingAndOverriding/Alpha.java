package secondPdf.polymorphismExamples.overloadingAndOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Alpha { // Суперкласс
    void show() { // Версия метода без аргумента
        System.out.println("Класс Alpha");
    }

    void show(String txt) { // Версия метода с текстовым аргументом
        System.out.println(txt);
    }
}