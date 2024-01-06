public class Question_10 {

    public static void main(String[] args) {
        String str1 = "orange ";
        String str2 = "apple";

        int result = str1.compareTo(str2);
                
        if (result > 0 ) {
          System.out.println(str2  + " comes before  " + str1 + ".");
        }else if (result < 0) {
            System.out.println(str1 +" comes before " + str2 + ".");
        }else 
        System.out.println(" Both are equal. ");

    }
}

