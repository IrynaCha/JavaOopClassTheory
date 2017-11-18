package firstPdf.using.usingObjectDemoTwo;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class UsingObjectDemoTwoMain {
    public static void main(String[] args) {
        ClassWithMethods classWithMethodsFirst = new ClassWithMethods();
        ClassWithMethods classWithMethodsSecond = new ClassWithMethods();
        classWithMethodsFirst.set(15, 'A');
        classWithMethodsSecond.set(16, 'D');
        showMessageDialog(null, classWithMethodsFirst.getInfo(), "Using methods", JOptionPane.INFORMATION_MESSAGE);
        showMessageDialog(null, classWithMethodsSecond.getInfo(), "Using methods", JOptionPane.WARNING_MESSAGE);
    }
}
