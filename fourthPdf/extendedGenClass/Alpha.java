package fourthPdf.extendedGenClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha extends Base<Integer> {
    // Конструктор:
    Alpha(Integer n) {
// Вызов конструктора суперкласса:
        super(n);
    } // Переопределение метода:

    void show() {
        System.out.print("Целочисленное поле: ");
// Вызов версии метода из суперкласса:
        super.show();
    }
}