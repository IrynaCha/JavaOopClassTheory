package secondPdf.inheritanceExamples.usingPrivates;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class UsingPrivatesMain {
    public static void main(String[] args) {
// Создание объекта подкласса:
        Bravo obj = new Bravo(100);
// Проверка значения поля:
        obj.show();
// Присваивание значения полю:
        obj.set(200);
// Отображение значения поля:
        obj.show();
    }
}
