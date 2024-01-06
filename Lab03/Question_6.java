import java.util.Arrays;

public class Question_6 {

    public static void main(String[] args) {
        
        String alphabet = "programming";
        char[] chArray = alphabet.toCharArray();
        Arrays.sort(chArray);

       
        String sortedStr = new String(chArray);

        System.out.println("Original String: " + alphabet);
        System.out.println("Sorted String: " + sortedStr);
    }
}