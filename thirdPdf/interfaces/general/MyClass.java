package thirdPdf.interfaces.general;

/**
 * Created by Kurnosova Iryna on 18.11.2017.
 */
class MyClass implements MyInterface {

    public int getNumber(double x) {
        return (int) x;
    }

    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}