package thirdPdf.interfaces.general;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
public class UsingInterfacesMain {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Статическая константа: " + MyClass.NUMBER);
        System.out.println("Целое число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(3));
    }
}
