package firstPdf.methods.methodArguments;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class NewMethodArguments {
    static void swap(int a, int b) {
        System.out.println("Swap method is executing");
        System.out.println("Arguments before changing: " + a + " and " + b);
        int x = b;
        b = a;
        a = x;
        System.out.println("Arguments after changing: " + a + " and " + b);
        System.out.println("Swap method has finished its work!");
    }
}
