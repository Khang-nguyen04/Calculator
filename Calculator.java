import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first whole number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter the second whole number: ");
            int secondNumber = scanner.nextInt();
            
            System.out.print("Enter + for addition or - for subtraction: ");
            String operation = scanner.next();

            if (operation.equals("+")) {
                int result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
            } else if (operation.equals("-")) {
                int result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Invalid operation. Please enter + or -.");
            }
        }
    }
}
