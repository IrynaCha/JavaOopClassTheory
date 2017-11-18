package secondPdf.inheritanceExamples.extendingJOptionPane;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class ExtendingJOptionPaneMain {
    public static void main(String[] args) {
        MyPane.showMessage("Всем привет!");
        int number;
        number = MyPane.getInteger("Введите целое число");
        String txt = "Числа от 1 до " + number + ":\n";
        for (int k = 1; k <= number; k++) {
            txt += k + " ";
        }
        MyPane.showMessage(txt, "Целые числа");
    }
}
