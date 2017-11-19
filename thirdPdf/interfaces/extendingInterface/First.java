package thirdPdf.interfaces.extendingInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface First {
    default void alpha() {
        System.out.println("Интерфейс First: метод alpha()");
    }

    default void bravo() {
        System.out.println("Интерфейс First: метод bravo()");
    }

    default void charlie() {
        System.out.println("Интерфейс First: метод charlie()");
    }

    void delta();
}