package thirdPdf.interfaces.extendingInterfaceSecond;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface Second extends First {
    default void alpha() {
        First.super.alpha(); // Вызов версии метода из интерфейса First
        System.out.println("Интерфейс Bravo: метод alpha()");
    }

    default void bravo() {
        System.out.println("Интерфейс Bravo: метод bravo()");
    }
}