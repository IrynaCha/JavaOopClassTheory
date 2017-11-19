package thirdPdf.interfaces.interfaceVariables;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Bravo implements Base {
    int number;

    Bravo(int n) {
        number = n;
    }

    public void show() {
        System.out.println("Объект класса Bravo");
        System.out.println("Целочисленное поле: " + number);
    }
}