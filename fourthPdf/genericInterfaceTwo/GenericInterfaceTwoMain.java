package fourthPdf.genericInterfaceTwo;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class GenericInterfaceTwoMain {
    public static void main(String[] args) {
        MyMethods ref;
        Alpha A = new Alpha(123);
        Bravo B = new Bravo('A');
        A.show();
        ref = A;
        ref.set(321);
        A.show();
        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
