
import java.util.Scanner;
public class Year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year you were born in: ");
        int year = scanner.nextInt();

        int age = 2023 - year;

        System.out.println("Person born in " + year + " then age is: " + age);

        scanner.close();
    }
}

