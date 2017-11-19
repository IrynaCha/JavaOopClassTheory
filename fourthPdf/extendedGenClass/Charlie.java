package fourthPdf.extendedGenClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Charlie extends Base<Character> {
    // Конструктор:
    Charlie(Character s) {
// Вызов конструктора суперкласса:
        super(s);
    } // Переопределение метода:

    void show() {
        System.out.print("Символьное поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
}