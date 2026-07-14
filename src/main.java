import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        while (true) {
            System.out.println("\n===================================");
            System.out.println("      SMART CONSOLE CALCULATOR      ");
            System.out.println("===================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Percentage");
            System.out.println("9. Exit");
            System.out.print("\nEnter your choice: ");
            
            choice = sc.nextInt();

            if (choice == 9) {
                System.out.println("\nThank you for using Smart Console Calculator! Application Terminated.");
                break;
            }

            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("👉 Result = " + result);
                    break;

                case 2: // Subtraction
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("👉 Result = " + result);
                    break;

                case 3: // Multiplication
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("👉 Result = " + result);
                    break;

                case 4: // Division
                    System.out.print("Enter Dividend (Number to divide): ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Divisor: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("❌ Error: Division by zero is not allowed!");
                    } else {
                        result = num1 / num2;
                        System.out.println("👉 Result = " + result);
                    }
                    break;

                case 5: // Modulus (Remainder)
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 % num2;
                    System.out.println("👉 Result (Remainder) = " + result);
                    break;

                case 6: // Power (x^y)
                    System.out.print("Enter Base Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Exponent/Power: ");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("👉 Result = " + result);
                    break;

                case 7: // Square Root
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();
                    if (num1 < 0) {
                        System.out.println("❌ Error: Cannot calculate square root of a negative number!");
                    } else {
                        result = Math.sqrt(num1);
                        System.out.println("👉 Square Root = " + result);
                    }
                    break;

                case 8: // Percentage
                    System.out.print("Enter Total Value: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Percentage Rate (e.g., 10 for 10%): ");
                    num2 = sc.nextDouble();
                    result = (num1 * num2) / 100;
                    System.out.println("👉 Percentage Value = " + result);
                    break;

                default:
                    System.out.println("❌ Invalid Choice! Please select a valid option.");
            }
        }
        sc.close();
    }
}