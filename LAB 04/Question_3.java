import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        filterDigits(array);
    }


    public static void filterDigits(int[] arr) {
        System.out.println("Original Array: ");
        displayArray(arr);

        System.out.println("\nSeparating even and odd digits:");

        System.out.print("Even Digits: ");
        for (int num : arr) {
            if (isEvenDigit(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd Digits: ");
        for (int num : arr) {
            if (!isEvenDigit(num)) {
                System.out.print(num + " ");
            }
        }
    }


    public static boolean isEvenDigit(int digit) {
        return digit % 2 == 0;
    }

    // Method to display the contents of the array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
