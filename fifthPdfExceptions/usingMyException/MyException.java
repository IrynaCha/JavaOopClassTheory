package fifthPdfExceptions.usingMyException;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
// Класс контролируемого исключения создается наследованием класса Exception:
public class MyException extends Exception {
    private int code;

    MyException(int n) {
        super();
        code = n;
    }

    public String toString() {
        String txt = "Исключение класса MyException\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "------------------------------";
        return txt;
    }
}