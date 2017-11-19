package fourthPdf.extendedGenClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class ExtendedGenClassMain {
    public static void main(String[] args) {
// Создание объектов:
        Alpha A = new Alpha(123);
        Bravo B = new Bravo("объект B");
        Charlie C = new Charlie('C');
// Вызов метода show() из разных объектов:
        A.show();
        B.show();
        C.show();
    }
}
