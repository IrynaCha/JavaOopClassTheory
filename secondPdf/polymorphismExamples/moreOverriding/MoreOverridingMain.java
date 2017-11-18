package secondPdf.polymorphismExamples.moreOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class MoreOverridingMain {
    public static void main(String[] args) {
        Alpha objA = new Alpha("objA");
        Bravo objB = new Bravo("objB", 123);
        objA.show();
        objB.show();
    }
}
