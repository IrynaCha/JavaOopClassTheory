package fourthPdf.extendedGenClass;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Base<X>{
    // Обобщенное поле:
    X data;
    // Конструктор:
    Base(X data){
        this.data=data;
    } // Метод для отображения значения поля:
    void show(){
        System.out.println(data);
    }
}