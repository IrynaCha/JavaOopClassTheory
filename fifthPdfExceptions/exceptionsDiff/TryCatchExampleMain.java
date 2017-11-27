package fifthPdfExceptions.exceptionsDiff;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class TryCatchExampleMain {
    public static void main(String[] args) {
        String input;
        int num;
        input = showInputDialog(null,
                "Введите число", // Текст над полем ввода
                "Число", // Название окна
                QUESTION_MESSAGE // Тип окна
        );
        try {
// Попытка преобразовать текст в число:
            num = parseInt(input);
            showMessageDialog(null,
                    "Числа " + (num - 1) + ", " + num + " и " + (num + 1),
                    "Числа", // Название окна
                    INFORMATION_MESSAGE // Тип окна
            );
        } catch (Exception e) {
            showMessageDialog(null,
                    "Что-то пошло не так...",
                    "Ошибка",
                    ERROR_MESSAGE
            );
        }
    }
}