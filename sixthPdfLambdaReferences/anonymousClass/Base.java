package sixthPdfLambdaReferences.anonymousClass;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
abstract class Base {
    private String name;

    Base(String txt) {
        name = txt;
    }

    void show() {
        System.out.println("Имя объекта: " + name);
    }

    abstract void hello();
}