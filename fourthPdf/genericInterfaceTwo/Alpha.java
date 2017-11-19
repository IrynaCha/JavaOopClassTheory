package fourthPdf.genericInterfaceTwo;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha implements MyMethods<Integer> {
    // Закрытое поле целочисленного типа:
    private Integer value;

    // Описание методов из интерфейса:
    public Integer get() {
        return value;
    }

    public void set(Integer arg) {
        value = arg;
    }

    void show() {
        System.out.println("Целочисленное поле: " + get());
    }

    Alpha(Integer arg) {
        value = arg;
    }
}