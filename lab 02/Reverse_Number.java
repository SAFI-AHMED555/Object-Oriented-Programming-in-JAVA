import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        try (Scanner Back = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int sky = Back.nextInt();

            int reversed_Number = 0;

            while (sky != 0) {
                int digit = sky % 10;
                reversed_Number = reversed_Number * 10 + digit;
                sky = sky / 10;
            }

            System.out.println("Reverse of the number: " + reversed_Number);
        }
    }
}
