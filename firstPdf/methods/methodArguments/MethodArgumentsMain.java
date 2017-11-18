package firstPdf.methods.methodArguments;

import static firstPdf.methods.methodArguments.NewMethodArguments.swap;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class MethodArgumentsMain {
    public static void main(String[] args) {
        int m = 200;
        int n = 300;
        System.out.println("Arguments before changing: " + m + " and " + n);
        swap(m, n);
        System.out.println("Arguments after changing: " + m + " and " + n);
    }
}
