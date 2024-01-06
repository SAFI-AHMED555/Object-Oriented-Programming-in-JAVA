public class Question_5 {
    
    public static void main(String[] args) {
        String delete = "Programming is fun , when its executed";
        
        for (int i = 0; i < delete.length() ; i++) {
            char ch =delete.charAt(i);
             
            if (delete.indexOf(ch) == delete.lastIndexOf(ch))
            
            {
                System.out.print(ch);
            }
        }
    }        
}

