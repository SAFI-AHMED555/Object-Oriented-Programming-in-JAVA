import java.util.Scanner;
public class Character_type {
    public static void main(String[] args) {
        try (Scanner word = new Scanner(System.in)) {
            System.out.println("Enter a character: ");
            char variable = word.next().charAt(0);

            // Check and display the type of character
            if (Character.isLowerCase(variable)) {
                System.out.println(variable + " is a lowercase letter.");
            } else if (Character.isUpperCase(variable)) {
                System.out.println(variable + " is an uppercase letter.");
            } else if (Character.isDigit(variable)) {
                System.out.println(variable + " is a digit.");
            } else {
                System.out.println(variable + " is a special character.");
            }
        }
    }
}

    

