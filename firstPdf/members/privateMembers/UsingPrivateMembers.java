package firstPdf.members.privateMembers;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
class UsingPrivateMembers {
    private static int i = 1;
    private int number;
    private String name;

    UsingPrivateMembers(String n) {
        i++;
        this.name = n;
        this.number = i;
        System.out.println("Sth" + name);
    }

    public void show() {
        System.out.println("Name " + name);
        System.out.println("Number" + number);
        System.out.println("Sth" + i);
    }

    public void set(String sth) {
        this.name = sth;
    }
}
