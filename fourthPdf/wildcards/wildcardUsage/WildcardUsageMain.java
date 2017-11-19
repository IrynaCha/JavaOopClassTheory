package fourthPdf.wildcards.wildcardUsage;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class WildcardUsageMain {
    static <T> void show(MyClass<T> obj) {
        System.out.println("Вызов метода show():");
        System.out.println(obj.value);
    }

    static void display(MyClass<?> obj) {
        System.out.println("Вызов метода display():");
        System.out.println(obj.value);
    }

    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>(100);
        MyClass B = new MyClass<>('B');
        MyClass<?> C = new MyClass<>("Объект С");
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}