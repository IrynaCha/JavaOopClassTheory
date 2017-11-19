package fourthPdf.genericClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass<X> { // Обобщенный класс с одним параметром типа
    X data; // Поле обобщенного типа

    MyClass(X data) { // Конструктор с аргументом обобщенного типа
        this.data = data; // Присваивание значения полю
    }

    void show() { // Метод для отображения значения поля
        System.out.println("Значение поля: " + data);
    }
}