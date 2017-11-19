package thirdPdf.interfaces.extendingInterfaceSecond;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass implements Second {
    public void bravo() {
        Second.super.bravo();
        System.out.println("Класс MyClass: метод bravo()");
    }
}