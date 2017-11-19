package thirdPdf.interfaces.interfaceVariables;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
class Alpha implements Base {
    String word;

    Alpha(String txt) {
        word = txt;
    }

    public void show() {
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: " + word);
    }
}