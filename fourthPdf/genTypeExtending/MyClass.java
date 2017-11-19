package fourthPdf.genTypeExtending;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass<X extends Base> {
    // Поле обобщенного типа:
    X obj;

    MyClass(X obj) {
        this.obj = obj;
    } // Метод обобщенного класса:

    void show() {
        System.out.println("Объект класса MyClass");
// Вызов метода из поля обобщенного типа:
        obj.show();
    }
}