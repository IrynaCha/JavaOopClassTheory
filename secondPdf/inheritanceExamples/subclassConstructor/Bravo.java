package secondPdf.inheritanceExamples.subclassConstructor;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
// Подкласс:
class Bravo extends Alpha {
    // Символьное поле:
    char symbol;

    // Закрытый метод для отображения значения символьного поля:
    private void show() {
        System.out.println("Класс Bravo:");
// Отображение значения символьного поля:
        System.out.println("Поле symbol - " + this.symbol);
// Отображение "горизонтальной линии":
        for (int k = 1; k <= 18; k++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    // Конструктор с тремя аргументами:
    Bravo(String name, int code, char symbol) {
// Вызов конструктора суперкласса с двумя аргументами:
        super(name, code);
// Присваивание символьному полю значения:
        this.symbol = symbol;
// Вызов закрытого метода:
        show();
    }

    // Конструктор с одним символьным аргументом:
    Bravo(char symbol) {
// Вызов конструктора суперкласса без аргументов:
        super();
// Присваивание символьному полю значения:
        this.symbol = symbol;
// Вызов закрытого метода:
        show();
    }

    Bravo(String name) {
// Вызов конструктора суперкласса с одним текстовым аргументом:
        super(name);
// Присваивание символьному полю значения:
        this.symbol = 'A';
// Вызов закрытого метода:
        show();
    }

    Bravo(int code) {
// Вызов конструктора суперкласса с одним целочисленным аргументом:
        super(code);
// Присваивание символьному полю значения:
        this.symbol = 'B';
// Вызов закрытого метода:
        show();
    }

    Bravo() {
// Сначала неявно вызывается конструктор суперкласса без аргументов.
// Присваивание значения символьному полю:
        this.symbol = 'C';
// Вызов закрытого метода:
        show();
    }

    Bravo(String name, int code) {
// Вызов конструктора подкласса с тремя аргументами:
        this(name, code, 'D');
    }
}