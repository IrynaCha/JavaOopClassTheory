package thirdPdf.interfaces.extendingInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface Second extends First {
    void bravo();

    default void charlie() {
        System.out.println("Интерфейс Second: метод charlie()");
    }

    void echo();
}