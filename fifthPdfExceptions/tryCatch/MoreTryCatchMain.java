package fifthPdfExceptions.tryCatch;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class MoreTryCatchMain {
    public static void main(String[] args) {
        String input;
        char[] symbs;
        int size;//размер массива
        int index;//индекс элемента
        input = showInputDialog(null,
                "Укажите размер массива", // Текст над полем ввода
                "Символьный массив", // Название окна
                QUESTION_MESSAGE // Тип пиктограммы
        );
        try {
            size = parseInt(input);
            symbs = new char[size];
            String txt = "| ";
            for (int k = 0; k < size; k++) {
                symbs[k] = (char) ('A' + k);
                txt += symbs[k] + " | ";
            }
            showMessageDialog(null,
                    txt, // Сообщение
                    "Символы из массива", // Название окна
                    INFORMATION_MESSAGE // Тип сообщения
            );
            input = showInputDialog(null,
                    "Укажите индекс элемента", // Текст над полем ввода
                    "Индекс элемента массива", // Название окна
                    QUESTION_MESSAGE);// Тип пиктограммы
            index = parseInt(input);
            txt = "Индекс - " + index + "\nСимвол - " + symbs[index];
            showMessageDialog(null,
                    txt, // Текст сообщения
                    "Символ", // Название окна
                    INFORMATION_MESSAGE // Тип окна
            );
        }
// Отмена или ввод нечислового значения
        catch (NumberFormatException e) {
            showMessageDialog(null,
                    "К сожалению, возникала ошибка...",
                    "Ошибка", // Название окна
                    WARNING_MESSAGE // Тип окна
            );
        }
        // неверный размер для массива
        catch (NegativeArraySizeException e) {
            showMessageDialog(null,
                    "Некорректный размер массива!",
                    "Ошибка при создании массива",
                    ERROR_MESSAGE
            );
        } //неверное значение для индекса элемента массива:
        catch (ArrayIndexOutOfBoundsException e) {
            showMessageDialog(null,
                    "Вы уверены? Такого элемента нет!",
                    "Ошибка при выборе индекса",
                    QUESTION_MESSAGE
            );
        }
    }
}