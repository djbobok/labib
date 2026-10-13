/**
 * Объединяет переданные аргументы и выводит полученную строку задом наперед.
 */
public class ReverseArguments {
    /**
     * Обрабатывает аргументы командной строки и выводит строку в обратном порядке.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Передайте текстовые аргументы командной строки.");
            return;
        }

        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i > 0) {
                inputBuilder.append(' ');
            }
            inputBuilder.append(args[i]);
        }

        String input = inputBuilder.toString();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
