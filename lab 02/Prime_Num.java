import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        try (Scanner Anything = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = Anything.nextInt();

            if (number <= 1) {
                System.out.println(number + " is not a prime number.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        }
    }
}
