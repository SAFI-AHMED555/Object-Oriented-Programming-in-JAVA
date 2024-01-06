import java.util.Scanner;
public class Vowel_Consonant {
    public static void main(String[] args, Scanner checker) {
        try (Scanner  = new Scanner(System.in)) {
            System.out.print("Please Enter the Character: ");
            char inputletter = checker.next().charAt(0);

            if (inputletter == 'a' || inputletter== 'e' || inputletter == 'i' || inputletter == 'o' || inputletter == 'u') {
                System.out.println(inputletter + " is a vowel.");
            } else {
                System.out.println(inputletter + " is a consonant.");
            }
        }
    }
}
