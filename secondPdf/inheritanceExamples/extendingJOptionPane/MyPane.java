package secondPdf.inheritanceExamples.extendingJOptionPane;

import javax.swing.*;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
class MyPane extends JOptionPane {
    static void showMessage(String txt, String title) {
        showMessageDialog(null, txt, title, PLAIN_MESSAGE);//);//, new ImageIcon("d:/books/pictures/giraffe.png"));
    }

    static void showMessage(String txt) {
        showMessage(txt, "Сообщение");
    }

    static int getInteger(String txt) {
        String res;
        res = showInputDialog(null, txt, "Число (по умолчанию 10)", QUESTION_MESSAGE);
        if (res == null) {
            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }
}