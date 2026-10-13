import java.math.BigInteger;
import java.util.Scanner;

/**
 * Выводит указанное количество первых чисел Фибоначчи, начиная с 1, 1.
 */
public class Fibonacci {
    /**
     * Читает количество элементов и выводит первые числа Фибоначчи.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: требуется целое число.");
            scanner.close();
            return;
        }

        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.println("Количество должно быть положительным.");
            scanner.close();
            return;
        }

        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;

        for (int i = 1; i <= count; i++) {
            System.out.print(first);
            if (i < count) {
                System.out.print(" ");
            }
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
        System.out.println();
        scanner.close();
    }
}
