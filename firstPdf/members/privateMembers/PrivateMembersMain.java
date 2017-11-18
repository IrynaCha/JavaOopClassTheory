package firstPdf.members.privateMembers;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class PrivateMembersMain {
    public static void main(String[] args) {
        UsingPrivateMembers usingPrivateMembers = new UsingPrivateMembers("Name1");
        UsingPrivateMembers usingPrivateMembers1 = new UsingPrivateMembers("Name2");
        UsingPrivateMembers usingPrivateMembers2 = new UsingPrivateMembers("f");
        usingPrivateMembers.show();
        usingPrivateMembers1.show();
        usingPrivateMembers2.show();
        usingPrivateMembers1.set("Qn");
        usingPrivateMembers1.show();
    }
}