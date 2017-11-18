package firstPdf.swap.swapObjects;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class SwapObjectsMain {
    static void swap(Swapping A, Swapping B) {
        System.out.println("Выполняется метод swap()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        Swapping X = B;
        B = A;
        A = X;
        System.out.println("Значения аргументов изменены");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }

    public static void main(String[] args) {
        Swapping A = new Swapping(100);
        Swapping B = new Swapping(200);
        System.out.println("До вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
    }
}
