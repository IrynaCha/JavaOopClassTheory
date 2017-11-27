package fifthPdfExceptions.nestedTryCatch;

import java.util.*;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class NestedTryCatchMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] symbs;
        int size; //array size
        int index; //element's index
        try {
            System.out.print("Укажите размер массива: ");
            size = input.nextInt();
            symbs = new char[size];
            System.out.print("| ");
            for (int k = 0; k < size; k++) {
                symbs[k] = (char) ('A' + k);
                System.out.print(symbs[k] + " | ");
            }
            try {
                System.out.print("\nУкажите индекс: ");
                index = input.nextInt();
                System.out.println("Символ - " + symbs[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Такого элемента нет");
            } finally {
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        }
//input is not a digit
        catch (InputMismatchException e) {
            System.out.println("Ошибка: вы не ввели число");
        }
// array size is less than a zero
        catch (NegativeArraySizeException e) {
            System.out.println("Неверный размер массива");
        }
        System.out.println("Выполнение программы завершено");
    }
}