package thirdPdf.interfaces.methodFromInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
interface First {
    default void hello(){
        System.out.println("Method from First interface");
    }
}
