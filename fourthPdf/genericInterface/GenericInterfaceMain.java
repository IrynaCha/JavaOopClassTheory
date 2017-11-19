package fourthPdf.genericInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class GenericInterfaceMain {
    public static void main(String[] args) {
// Интерфейсная переменная:
        MyMethods ref;
// Создание объектов на основе обобщенного класса:
        MyClass<Integer> A = new MyClass<>(123);
        MyClass<Character> B = new MyClass<>('A');
// Вызов метода из объекта класса:
        A.show();
// Интерфейсной переменной присваивается значение:
        ref = A;
// Вызов метода через интерфейсную переменную:
        ref.set(321);
// Вызов методов из объектов класса:
        A.show();
        B.show();
// Интерфейсной переменной присваивается значение:
        ref = B;
// Вызов метода через интерфейсную переменную:
        ref.set('B');
// Вызов метода из объекта класса:
        B.show();
    }
}