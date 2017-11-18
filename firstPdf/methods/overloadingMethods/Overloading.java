package firstPdf.methods.overloadingMethods;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
class Overloading {
    public int number;
    public char symbol;

    void set(int n) {
        this.number = n;
    }

    void set(char s) {
        this.symbol = s;
    }

    void set(int n, char s) {
        /*this.number = n;
        this.symbol = s;*/
        set(n);
        set(s);
    }

    void set() {
        set(12, 'p');
    }

    void show() {
        System.out.println("Digit: " + number + " Symbol: " + symbol);
    }

    void show(String text) {
        System.out.println(text + " Digit: " + number + " Symbol: " + symbol);
    }
    void show(String txt1,String txt2){
        System.out.println(txt1+": "+number);
        System.out.println(txt2+": "+symbol);
    }
}
