package thirdPdf.interfaces.methodFromInterface;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */

class MyClass implements First, Second {
    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}