package thirdPdf.interfaces.interfaceInheritance;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass extends Base implements First, Second {
    public String getFirst() {
        return "Интерфейс First";
    }

    public String getSecond() {
        return "Интерфейс Bravo";
    }

    public void show() {
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
}