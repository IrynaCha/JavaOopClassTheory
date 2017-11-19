package fourthPdf.genericInterfaceTwo;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Bravo implements MyMethods<Character> {
    // Закрытое поле символьного типа:
    private Character value;

    // Описание методов из интерфейса:
    public Character get() {
        return value;
    }

    public void set(Character arg) {
        value = arg;
    }

    void show() {
        System.out.println("Символьное поле: " + get());
    }

    Bravo(Character arg) {
        value = arg;
    }
}