package secondPdf.inheritanceExamples.superAndSub;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class SuperAndSubMain {
    public static void main(String[] args) {
// Создание объекта суперкласса:
        Alpha objA = new Alpha();
// Присваивание значения полю объекта суперкласса:
        objA.name = "alpha";
// Вызов метода из объекта суперкласса:
        objA.show();
// Создание объекта подкласса:
        Bravo objB = new Bravo();
// Присваивание значений полям объекта подкласса:
        objB.name = "bravo";
        objB.code = 123;
// Вызов метода из объекта подкласса:
        objB.show();
// Переменной суперкласса значением присваивается ссылка на объект подкласса:
        objA = objB;
// Значение поля объекта подкласса изменяется через переменную суперкласса:
        objA.name = "charlie";
// Вызов метода из объекта подкласса через переменную суперкласса:
        objA.show();
// Вызов метода из объекта подкласса через переменную подкласса:
        objB.show();
    }
}
