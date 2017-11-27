package fifthPdfExceptions.usingThrow;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class UsingThrowMain {
    public static void main(String[] args) {
        Exception me = new Exception("Искусственная ошибка");
        try {
            System.out.println("Генерируется ошибка");
            try {
                throw me;
            } catch (Exception one) {
                System.out.println(one);
                System.out.println("А теперь еще одна ошибка");
                throw one;
            }
        } catch (Exception two) {
            System.out.println(two);
        }
        System.out.println("Выполнение программы завершено");
    }
}
