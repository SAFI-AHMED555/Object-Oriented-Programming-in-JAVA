public class Question_1 {
    public static void main(String[] args) {
        
        String name = "Programming is a part of my life !!";
        char ch ;

        StringBuilder reverse = new StringBuilder(name).reverse();
        System.out.println(" 1st Approach : ");
        System.out.println(reverse);

        
        System.out.println(" 2nd Approach : " );
        for (int i = (name.length() -1); i >= 0 ; i--) {
            ch =name.charAt(i);
            System.out.print(ch);
        }


    }
}