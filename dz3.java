import java.util.Scanner;
public class dz3 {        // Четвертое задание - создаем просто калькулятор.
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = iScanner.nextInt();
        System.out.println("Выберете арефмитическое действие: +, -, *, /,");
        String choice = iScanner.next();
        iScanner.close();

        int result = 0;
        switch (choice) {
            case ("+"):
                result = number1 + number2;
                break;

            case ("-"):
                result = number1 - number2;
                break;

            case ("*"):
                result = number1 * number2;
                break;

            case ("/"):
                result = number1 / number2;
                break;

            default:
                break;
        }
        System.out.println(number1 + " " + choice + " " + number2 + " = " + result);
    }
}
