package thirdPdf.interfaces.extendingInterfaceSecond;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface First{
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
}