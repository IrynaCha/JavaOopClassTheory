package thirdPdf.interfaces.defaultMethods;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface Base {
    default void show(String txt) {
        System.out.println("Интерфейс Base: " + txt);
    }

    void hello();
}