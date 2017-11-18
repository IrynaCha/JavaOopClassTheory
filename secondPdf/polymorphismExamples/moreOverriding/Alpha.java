package secondPdf.polymorphismExamples.moreOverriding;

/**
 * Created by Kurnosova Iryna on 15.11.2017.
 */
public class Alpha {
    String name;

    void show() {
        System.out.println("Объект " + name);
    }

    Alpha(String name) {
        this.name = name;
    }
}
