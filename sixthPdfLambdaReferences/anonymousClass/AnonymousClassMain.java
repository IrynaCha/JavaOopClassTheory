package sixthPdfLambdaReferences.anonymousClass;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class AnonymousClassMain {
    public static void main(String[] args) {
        // Создание объекта анонимного класса:
        Base obj = new Base("Красный") {
            // Описание абстрактного метода из суперкласса:
            void hello() {
                System.out.println("Объект анонимного класса");
            }
        };
        // Вызов методов из объекта, созданного на основе анонимного класса:
        obj.show();
        obj.hello();
        // Создание анонимного объекта анонимного класса и вызов их этого объекта метода showAll(), описанного в анонимном классе:
        new Base("Зеленый") {
            // Описание абстрактного метода из суперкласса:
            void hello() {
                System.out.println("Анонимный объект");
            }

            // Описание нового метода:
            void showAll() {
                hello();
                show();
            }
        }.showAll(); // Вызов метода
    }
}