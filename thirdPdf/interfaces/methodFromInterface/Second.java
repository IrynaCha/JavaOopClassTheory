package thirdPdf.interfaces.methodFromInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface Second {
    default void hello() {
        System.out.println("Метод из интерфейса Second");
    }
}