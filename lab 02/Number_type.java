import java.util.Scanner;

public class Number_type {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner number = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            double userinput = number.nextDouble();
            if (userinput > 0.0) {
                System.out.println(userinput + " is a positive number.");
            } else if (userinput <0.0) {
                System.out.println(userinput + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
