package fourthPdf.genericInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass<X> implements MyMethods<X> {
    private X value; // Закрытое поле обобщенного типа

    public X get() { // Описание методов из интерфейса
        return value;
    }

    public void set(X arg) {
        value = arg;
    }

    void show() {
        System.out.println("Значение поля: " + get());
    }

    MyClass(X arg) {
        value = arg;
    }
}