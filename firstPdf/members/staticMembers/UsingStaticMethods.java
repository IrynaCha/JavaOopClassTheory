package firstPdf.members.staticMembers;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class UsingStaticMethods {
    static int i = 0;

    UsingStaticMethods() {
        i++;
        System.out.println("Создан объект номер " + i);
    }

    static void show() {
        System.out.println("Sth count " + i);
    }
}