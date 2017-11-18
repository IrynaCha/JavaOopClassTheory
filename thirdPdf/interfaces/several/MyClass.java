package thirdPdf.interfaces.several;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */

class MyClass implements First, Second {
    public void hello() {
        System.out.println("Метод из интерфейса First");
    }

    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }
}
