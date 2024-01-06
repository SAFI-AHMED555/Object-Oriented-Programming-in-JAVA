public class Question_8 {
    public static void main(String[] args) {
        String str = "Java is a programming language because it is platform independent ";
        char ch;

        int strLen = str.length();
        for (int i = 0; i < strLen ; i++) {
            ch =str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("Character is " + ch + " at index  " + i);
                return ;
            }    
        }
    }
}
