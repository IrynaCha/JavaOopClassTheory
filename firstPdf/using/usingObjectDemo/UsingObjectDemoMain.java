package firstPdf.using.usingObjectDemo;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class UsingObjectDemoMain {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.number = 16;
        firstClass.symbol = 'A';
        String text = "Digit: " + firstClass.number + "Symbol: " + firstClass.symbol;
        showMessageDialog(null, text, "Using Object", JOptionPane.WARNING_MESSAGE);
    }
}
