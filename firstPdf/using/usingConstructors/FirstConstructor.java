package firstPdf.using.usingConstructors;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class FirstConstructor {
    public int number;
    public char symbol;

    FirstConstructor() {
        number = 10;
        symbol = 'H';
    }

    FirstConstructor(int n, char s) {
        this.number = n;
        this.symbol = s;
    }

    void show() {
        System.out.println("Digit: " + number + " Symbol: " + symbol);
    }
}
