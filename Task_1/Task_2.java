import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        // сканер объект для ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // ввод первой строки
        System.out.print("Enter the first string: ");
        String stringA = scanner.nextLine();

        // ввод второй строки
        System.out.print("Enter the second string: ");
        String stringB = scanner.nextLine();

        // сравнить две строки
        if (stringA.equals(stringB)) {
            System.out.println("The strings are identical.");
        } else {
            System.out.println("The strings are not identical.");
        }
    }
}
