package firstPdf.arrays.arrayOfObjects;

/**
 * Created by Kurnosova Iryna on 11.11.2017.
 */
public class ArrayOfObjectsMain {
    static MyClassA[] createBinoms(int n) {
        MyClassA[] bins = new MyClassA[n + 1];
        bins[0] = new MyClassA(1);
        for (int k = 1; k <= n; k++) {
            bins[k] = new MyClassA(bins[k - 1].get() * (n - k + 1) / k);
        }
        return bins;
    }

    static void show(MyClassA[] objs) {
        String txt = "| ";
        for (int k = 0; k < objs.length; k++) {
            txt += objs[k].get() + " | ";
        }
        System.out.println(txt);
    }

    // Главный метод программы:
    public static void main(String[] args) {
        MyClassA[] A = createBinoms(5);
        MyClassA[] B = createBinoms(10);
        show(A);
        show(B);
    }
}
