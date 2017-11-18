package secondPdf.inheritanceExamples.subclassConstructor;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class SubclassConstructorMain {
    public static void main(String[] args) {
        Bravo obj;
        obj = new Bravo();
        obj = new Bravo("Красный");
        obj = new Bravo(100);
        obj = new Bravo("Зеленый", 200);
        obj = new Bravo('Y');
        obj = new Bravo("Синий", 300, 'Z');
    }
}
