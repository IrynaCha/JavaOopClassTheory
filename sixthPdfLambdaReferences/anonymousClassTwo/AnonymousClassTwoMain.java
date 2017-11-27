package sixthPdfLambdaReferences.anonymousClassTwo;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class AnonymousClassTwoMain {
    public static void main(String[] args) {
        Base obj = new Base() {
            public void hello() {
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        // Создание анонимного объекта анонимного класса и вызов их этого объекта метода showAll(), описанного в анонимном классе:
        new Base() {
            // Описание метода из интерфейса:
            public void hello() {
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