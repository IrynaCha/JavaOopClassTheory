package fourthPdf.genTypeExtending;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Bravo extends Alpha {
    char symbol;

    Bravo(String txt, int n, char s) {
        super(txt, n);
// Присваивание значения символьному полю:
        symbol = s;
    }

    // Переопределение метода:
    void show() {
// Вызов версии метода из суперкласса:
        super.show();
// Отображение значения символьного поля:
        System.out.println("Символьное поле: " + symbol);
    }
}