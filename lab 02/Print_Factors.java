import java.util.Scanner;
public class Print_Factors {
    public static void main(String[] args) {
        try (Scanner Print = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = Print.nextInt();

            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
