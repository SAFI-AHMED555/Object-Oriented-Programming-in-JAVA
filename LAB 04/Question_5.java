import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the key value to search: ");
        int key = scanner.nextInt();
        scanner.close();
        searchMethod(array, key);
    }

    // Method to search for a key value in the array
    public static void searchMethod(int[] arr, int key) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}

