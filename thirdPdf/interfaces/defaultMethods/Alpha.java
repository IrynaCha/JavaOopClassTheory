package thirdPdf.interfaces.defaultMethods;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha implements Base {
    public void hello() {
        System.out.println("Объект класса Alpha");
    }

    public void show(String txt) {
        System.out.println("Класс Alpha: " + txt);
    }
}