package fourthPdf.genericClasses;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class UsingGenericsMain {
    public static void main(String[] args) {
// Создание объекта на основе обобщенного класса:
        Bravo<Integer, Character> A = new Bravo<Integer, Character>(100, 'A');
// Отображение значений полей объекта:
        A.show();
// Создание объекта на основе обобщенного класса:
        Bravo<String, Double> B = new Bravo<>("BRAVO", 12.345);
// Отображение значений полей объекта:
        B.show();
    }
}
