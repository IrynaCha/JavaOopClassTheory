package firstPdf.members.staticMembers;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class StaticMembersMain {
    public static void main(String[] args) {
        UsingStaticMethods.show();
        UsingStaticMethods usingStaticMethods = new UsingStaticMethods();
        UsingStaticMethods usingStaticMethods1 = new UsingStaticMethods();
        UsingStaticMethods usingStaticMethods2 = new UsingStaticMethods();
        UsingStaticMethods.show();
        usingStaticMethods2.show();
        usingStaticMethods1.show();
    }
}
