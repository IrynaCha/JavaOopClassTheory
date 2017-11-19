package fourthPdf.extendedGenClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Bravo extends Base<String> {
    // Конструктор:
    Bravo(String txt) {
// Вызов конструктора суперкласса:
        super(txt);
    } // Переопределение метода:

    void show() {
        System.out.print("Текстовое поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
}