package fourthPdf.wildcards.boundedWildcards;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class BoundedWildcardsMain {
    static void show(MyClass<? extends Charlie> obj) {
        System.out.println(obj);
    }

    static void display(MyClass<? super Charlie> obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        MyClass<Alpha> A = new MyClass<>(new Alpha("Объект A"));
        MyClass<Bravo> B = new MyClass<>(new Bravo("Объект B"));
        MyClass<Charlie> C = new MyClass<>(new Charlie("Объект C"));
        MyClass<Delta> D = new MyClass<>(new Delta("Объект D"));
        MyClass<Echo> E = new MyClass<>(new Echo("Объект E"));
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}
