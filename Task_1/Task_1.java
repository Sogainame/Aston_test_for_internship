import java.util.Scanner;

public class CompareAndOperate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        compareNumbers(a, b);
        performOperations(a, b);

        scanner.close();
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performOperations(int a, int b) {
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division;
        
        if (b != 0) {
            division = (double) a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        System.out.printf("a + b = %d%n", addition);
        System.out.printf("a - b = %d%n", subtraction);
        System.out.printf("a * b = %d%n", multiplication);
        System.out.printf("a / b = %.2f%n", division);
    }
}
