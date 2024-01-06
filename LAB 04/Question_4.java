import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 7, 10, 15 };
        int[] array2 = {6, 5, 7, 10, 3 };


        int[] sumArray = addArrays(array1, array2);


        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum of parallel values: " + Arrays.toString(sumArray));
    }


    public static int[] addArrays(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }
}
