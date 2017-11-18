package firstPdf.objects.objectAsResult;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class ObjectAsResultMain {
    static MyClassP createObject(int n, String s) {
        return new MyClassP(n, s);
    }

    public static void main(String[] args) {
        MyClassP obj = createObject(100, "alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        createObject(300, "charlie").set(400, "delta").show();
    }
}
