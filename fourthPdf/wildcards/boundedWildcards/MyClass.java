package fourthPdf.wildcards.boundedWildcards;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class MyClass<T> {
    private T obj;

    public String toString() {
        return obj.toString();
    }

    MyClass(T arg) {
        obj = arg;
    }
}