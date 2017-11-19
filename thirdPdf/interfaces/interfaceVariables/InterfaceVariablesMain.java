package thirdPdf.interfaces.interfaceVariables;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class InterfaceVariablesMain {
    public static void main(String[] args) {
        Base ref;
        ref = new Alpha("текст");
        ref.show();
        ref = new Bravo(123);
        ref.show();
    }
}
