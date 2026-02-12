import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first whole number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter the second whole number: ");
            int secondNumber = scanner.nextInt();
            
            int sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);
        }
    }
}
