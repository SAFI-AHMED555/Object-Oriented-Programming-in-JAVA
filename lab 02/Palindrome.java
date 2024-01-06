import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner hello = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = hello.nextInt();

            int originalNumber = number;
            int reversedNum = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNum = reversedNum * 10 + digit;
                number /= 10;
            }

            if (originalNumber == reversedNum) {
                System.out.println(originalNumber + " is a palindrome.");
            } else {
                System.out.println(originalNumber + " is not a palindrome.");
            }
        }
    }
}
