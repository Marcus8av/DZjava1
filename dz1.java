import java.util.Scanner;
public class dz1 { 
    public static void main(String[] args) {
        factorial();         // Первое задание - вычесляем факториал.
        number_triangular(); // Второе задание - вычесляем треугольное число.
    }

    public static void factorial() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int b = iScanner.nextInt();
        int result = 1;
        for (int index = 1; index <= b; index++) {
            result = result * index;
        }
        System.out.println("Факториал введенного числа =" + result);
    }

    public static void number_triangular() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = iScanner.nextInt();
        int result = 0;
        for (int index = 1; index <= a; index++) {
            result = result + index;
        }
        System.out.println("Введенного треугольное число =" + result);
    }
}



