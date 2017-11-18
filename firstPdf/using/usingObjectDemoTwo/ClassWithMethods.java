package firstPdf.using.usingObjectDemoTwo;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class ClassWithMethods {
    public int number;
    public char symbol;

    void set(int n, char s) {
        this.number = n;
        this.symbol = s;
    }

    String getInfo() {
        String txt = "Digit: " + number + " Symbol: " + symbol;
        return txt;
    }
}
