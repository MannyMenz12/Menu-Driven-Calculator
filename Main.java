import java.util.Scanner;

public class Main {
    // Method for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    static int divide(int a, int b) {
        return a / b;
    }

    // Method for modulo
    static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            choice = scanner.nextInt(); // Read user choice

            // Check if user chose to exit
            if (choice == 6) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Ask for two numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + modulo(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }

        } while (true);
    }
}
