import java.util.Scanner;

public class Last_digit {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n1 = num1.nextInt();

        int lastDigit = Math.abs(n1 % 10);

        System.out.print("Last digit is ");
        printDigitInWords(lastDigit);
    }

    private static void printDigitInWords(int digit) {
        switch (digit) {
            case 0:
                System.out.println("Zero!");
                break;
            case 1:
                System.out.println("One!");
                break;
            case 2:
                System.out.println("Two!");
                break;
            case 3:
                System.out.println("Three!");
                break;
            case 4:
                System.out.println("Four!");
                break;
            case 5:
                System.out.println("Five!");
                break;
            case 6:
                System.out.println("Six!");
                break;
            case 7:
                System.out.println("Seven!");
                break;
            case 8:
                System.out.println("Eight!");
                break;
            case 9:
                System.out.println("Nine!");
                break;
            default:
                System.out.println("Invalid digit!");
        }
    }
}
