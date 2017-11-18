package secondPdf.toStringUsage;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
// Главный класс:
public class UsingToStringMain {
    // Главный метод:
    public static void main(String[] args) {
// Создание объекта:
        MyClass obj = new MyClass("объект obj", 123);
// Объект передан аргументом методу:
        System.out.println(obj);
    }
}