package fourthPdf.genTypeExtending;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha extends Base {
    int number;

    Alpha(String txt, int n) {
        super(txt);
        number = n;
    }

    void show() {
        super.show();
        System.out.println("Целочисленное поле: " + number);
    }
}