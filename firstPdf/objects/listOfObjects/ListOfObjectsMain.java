package firstPdf.objects.listOfObjects;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class ListOfObjectsMain {
    static MyClassList createList(int n) {
        MyClassList obj = new MyClassList();
        obj.number = 1;
        MyClassList t = obj;
        for (int k = 1; k <= n; k++) {
            t.next = new MyClassList();
            t.next.number = t.number * (n - k + 1) / k;
            t = t.next;
        }
        t.next = null;
        return obj;
    }

    static void showList(MyClassList obj) {
        String txt = "| ";
        MyClassList t = obj;
        do {
            txt += t.number + " | ";
            t = t.next;
        } while (t != null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClassList A = createList(5);
        MyClassList B = createList(10);
        showList(A);
        showList(B);
    }
}
