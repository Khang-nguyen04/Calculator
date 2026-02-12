import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();
            
            System.out.print("Enter + for addition, - for subtraction, * for multiplication, or / for division: ");
            String operation = scanner.next();

            if (operation.equals("+")) {
                double result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
            } else if (operation.equals("-")) {
                double result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
            } else if (operation.equals("*")) {
                double result = firstNumber * secondNumber;
                System.out.println("The result is: " + result);
            } else if (operation.equals("/")) {
                if (secondNumber == 0) {
                    System.out.println("Error: Divide by Zero");
                } else {
                    double result = firstNumber / secondNumber;
                    System.out.println("The result is: " + result);
                }
            } else {
                System.out.println("Invalid operation. Please enter +, -, *, or /.");
            }
        }
    }
}
