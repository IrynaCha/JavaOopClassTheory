package fourthPdf.genTypeExtending;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Base {
    String name;

    Base(String txt) {
        name = txt;
    }

    void show() {
        System.out.println("Текстовое поле: " + name);
    }
}