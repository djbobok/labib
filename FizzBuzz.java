/**
 * Выводит числа от 1 до 500, заменяя кратные 5 и 7 числа словами.
 */
public class FizzBuzz {
    /**
     * Перебирает числа от 1 до 500 и выводит число или соответствующее слово.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (number % 5 == 0) {
                System.out.println("fizz");
            } else if (number % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
