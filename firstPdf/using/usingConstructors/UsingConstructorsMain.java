package firstPdf.using.usingConstructors;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class UsingConstructorsMain {
    public static void main(String[] args) {
        FirstConstructor objA = new FirstConstructor();
        FirstConstructor objB = new FirstConstructor(200, 'B');
        System.out.println("Объект objA:");
        objA.show();
        System.out.println("Объект objB:");
        objB.show();
    }
}
