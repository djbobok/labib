import java.util.Scanner;

/**
 * Из трех введенных целых чисел выводит числа, делящиеся на 3 или на 9.
 */
public class Variant3Divisible {
    /**
     * Считывает три числа и выводит значения, делящиеся на 3 или на 9.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Введите три целых числа:");
        for (int i = 0; i < numbers.length; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: требуется ввести три целых числа.");
                scanner.close();
                return;
            }
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Числа, которые делятся на 3 или на 9:");
        boolean found = false;
        for (int number : numbers) {
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.print(number + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Таких чисел нет.");
        } else {
            System.out.println();
        }
        scanner.close();
    }
}
