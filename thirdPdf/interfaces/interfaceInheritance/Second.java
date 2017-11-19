package thirdPdf.interfaces.interfaceInheritance;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface Second {
    String getSecond();

    default void show() {
        System.out.println("Интерфейс Second: метод show()");
    }
}