package sixthPdfLambdaReferences.anonymousClassTwo;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public interface Base {
    default void show() {
        System.out.println("Интерфейс Base");
    }

    void hello();
}
