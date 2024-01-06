import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
 
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}

 