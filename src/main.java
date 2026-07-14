import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("       SMART CONSOLE CALCULATOR        ");
        System.out.println("=======================================");

        while (true) {
            System.out.println("\nSelect an Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Square Root (sqrt)");
            System.out.println("8. Percentage (%)");
            System.out.println("9. Exit Application");
            System.out.print("Enter your choice (1-9): ");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("\nThank you for using Smart Console Calculator. Exiting...");
                break;
            }

            double num1 = 0, num2 = 0;

            // Handling operations that require two inputs
            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else if (choice == 7 || choice == 8) {
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero is undefined.");
                    } else {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
                case 6:
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 7:
                    if (num1 < 0) {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    } else {
                        System.out.println("Result: " + Math.sqrt(num1));
                    }
                    break;
                case 8:
                    System.out.print("Enter percentage rate (e.g., 10 for 10%): ");
                    double rate = scanner.nextDouble();
                    System.out.println("Result: " + ((num1 * rate) / 100));
                    break;
                default:
                    System.out.println("Invalid Selection. Please choose between 1 and 9.");
            }
            System.out.println("---------------------------------------");
        }
        scanner.close();
    }
}