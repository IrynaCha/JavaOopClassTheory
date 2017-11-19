package fourthPdf.usingGenMethods;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass {
    String name; // Текстовое поле

    <X> void show(X arg) { // Обобщенный метод
        System.out.println(name + ": " + arg);
    }

    MyClass(String txt) { // Конструктор
        name = txt;
    }
}