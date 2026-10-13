import java.math.BigInteger;
import java.util.Scanner;

/**
 * Вычисляет факториал введенного неотрицательного целого числа.
 */
public class Factorial {
    /**
     * Читает целое число и выводит его факториал.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицательное целое число: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: требуется целое число.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
            scanner.close();
            return;
        }

        BigInteger result = BigInteger.ONE;
        for (int multiplier = 2; multiplier <= number; multiplier++) {
            result = result.multiply(BigInteger.valueOf(multiplier));
        }

        System.out.println(number + "! = " + result);
        scanner.close();
    }
}
