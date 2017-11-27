package fifthPdfExceptions.usingCheckedExceptions;

/**
 * Created by Kurnosova Iryna on 27.11.2017.
 */
public class UsingCheckedExceptionsMain {
    static void alpha(int n) throws Exception {
        String txt = "Метод alpha() с аргументом " + n;
        throw new Exception(txt);
    }

    static void bravo(int n) {
        String txt = "Метод bravo() с аргументом " + n;
        try {
            if (n > 0) {
                throw new Exception(txt);
            } else {
// Генерирование неконтролируемого исключения:
                throw new RuntimeException(txt);
            }
        }
        // Обработка неконтролируемого исключения:
        catch (RuntimeException e) {
// Повторное генерирование неконтролируемого исключения:
            throw e;
        } // Обработка контролируемого исключения:
        catch (Exception e) {
            System.out.println("Обработка ошибки в bravo():");
            System.out.println(e.getMessage());
            System.out.println("***************************");
        }
    } // Метод для вызова при обработке исключений.

    // Аргументом методу передается объект исключения:
    static void catchMe(Exception e) {
        System.out.println("Обработка ошибки в main():");
        System.out.println(e.getMessage());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
// Контролируемый код:
        try {
// При вызове метода выбрасывается контролируемое исключение класса Exception:
            alpha(123);
        }
        // Обработка исключения:
        catch (Exception e) {
// Вызов метода для обработки исключения:
            catchMe(e);
        } // Контролируемый код:
        try {
// При вызове метода не выбрасывается исключение:
            bravo(123);
        } // Обработка исключения (блок не используется, поскольку исключение не генерируется):
        catch (Exception e) {
            catchMe(e);
        } // Контролируемый код:
        try {
// При вызове метода выбрасывается неконтролируемое исключение класса RuntimeException:
            bravo(-1);
        } catch (Exception e) {
            catchMe(e);
        }
    }
}