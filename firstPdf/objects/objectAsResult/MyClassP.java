package firstPdf.objects.objectAsResult;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
class MyClassP {
    private int code;
    private String name;

    MyClassP(int n, String s) {
        System.out.println("Создание объекта: ");
        set(n, s).show();
    }

    MyClassP set(int n) {
        this.code = n;
        return this;
    }

    MyClassP set(String s) {
        this.name = s;
        return this;
    }

    MyClassP set(int n, String s) {
        return set(n).set(s);
    }

    void show() {
        System.out.println("Поле code = " + code);
        System.out.println("Поле name = " + name);
        System.out.println("-----------------");
    }
}
