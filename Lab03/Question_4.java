
public class Question_4 {
public static void main(String[] args) {
    String Duplicate = "Programming is fun , when its execute";
    
    for (int i = 0; i < Duplicate.length() ; i++) {
        char ch =Duplicate.charAt(i);
         
        if (Duplicate.indexOf(ch) != Duplicate.lastIndexOf(ch))
        
        {
            System.out.print(ch);
        }
    }
  }
    
}