public class Question_7 {
        public static void main(String[] args) {
          String Occurence = "Hello";
           
          int[] charCounts = new int[256];
          for (char c : Occurence.toCharArray()) {
            charCounts[c]++;
          }
      
          System.out.println("The word is \"" + Occurence + "\"\n");
          for (char c : Occurence.toCharArray()) {
            System.out.println(c + " = " + charCounts[c]);
          }
        }
    }
