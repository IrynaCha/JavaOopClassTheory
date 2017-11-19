package fourthPdf.genericClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class GenericClassesMain {
    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<Integer>(100);
        MyClass<Character> B = new MyClass<Character>('B');
        MyClass<String> C = new MyClass<String>("Зеленый");
        A.show();
        B.show();
        C.show();
    }
}
