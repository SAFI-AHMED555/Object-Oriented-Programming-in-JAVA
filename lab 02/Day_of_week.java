import java.util.Scanner;

public class Day_of_week {
    public static void main(String[] args) {
        try (Scanner  = new Scanner(System.in)) {
            System.out.print("Enter a number (1-7): ");
            int current_day = insert_day.nextInt();

            switch (current_day) {
                case 1:
                    System.out.println("Day of the week: Sunday");
                    break;
                case 2:
                    System.out.println("Day of the week: Monday");
                    break;
                case 3:
                    System.out.println("Day of the week: Tuesday");
                    break;
                case 4:
                    System.out.println("Day of the week: Wednesday");
                    break;
                case 5:
                    System.out.println("Day of the week: Thursday");
                    break;
                case 6:
                    System.out.println("Day of the week: Friday");
                    break;
                case 7:
                    System.out.println("Day of the week: Saturday");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
    }
}
