import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter numbers to find sum of positive and negative integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Input: ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        calculateAndPrintAverages(numbers);
    }

    public static void calculateAndPrintAverages(int[] numbers) {
        int positiveSum = 0;
        int negativeSum = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        if (positiveCount > 0) {
            System.out.println("Average of positive integers is: " + ((double) positiveSum / positiveCount));
        } else {
            System.out.println("No positive integers entered.");
        }

        if (negativeCount > 0) {
            System.out.println("Average of negative integers is: " + ((double) negativeSum / negativeCount));
        } else {
            System.out.println("No negative integers entered.");
        }
    }
}

