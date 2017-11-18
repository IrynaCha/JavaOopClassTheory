package firstPdf.methods.overloadingMethods;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class OverloadingMethodsMain {
    public static void main(String[] args) {
        Overloading objA = new Overloading();
        Overloading objB = new Overloading();
        objA.set(100);
        objA.set('A');
        System.out.println("Объект objA:");
        objA.show();
        objB.set();
        objB.show("Объект objB");
        objB.set(200, 'B');
        objB.show("Число","Символ");
    }
}
