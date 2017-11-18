package secondPdf.inheritanceExamples.usingPrivates;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
// Суперкласс:
class Alpha {
    // Закрытое поле:
    private int code;

    // Открытый метод для присваивания значения закрытому полю:
    public void set(int code) {
        this.code = code;
    }

    // Открытый метод для отображения значения закрытого поля:
    public void show() {
        System.out.println("Поле code: " + code);
    }

    // Конструктор класса
    Alpha(int code) {
        set(code);
    }
}