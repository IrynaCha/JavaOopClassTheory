package thirdPdf.interfaces.interfaceInheritance;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface First {
    String getFirst();

    default void show() {
        System.out.println("Интерфейс First: метод show()");
    }
}