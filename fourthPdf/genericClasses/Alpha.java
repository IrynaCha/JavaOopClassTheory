package fourthPdf.genericClasses;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha<X> {
    private X first; // Закрытое поле обобщенного типа

    Alpha(X first) { // Конструктор с аргументом обобщенного типа
        set(first); // Вызов метода с аргументом обобщенного типа
    } // Метод с аргументом обобщенного типа для присваивания значения полю:

    void set(X first) {
        this.first = first;
    } // Метод возвращает результатом значение поля:

    X get() {
        return first;
    }
}