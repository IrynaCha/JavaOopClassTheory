package fifthPdfExceptions.usingMyException;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
// Класс неконтролируемого исключения создается наследованием класса RuntimeException:
public class MyMistake extends RuntimeException {
    private int code; // Закрытое числовое поле

    MyMistake(int n) {
        super();
        code = n;
    }

    public String toString() {
        String txt = "Исключение класса MyMistake\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "******************************";
        return txt;
    }
}