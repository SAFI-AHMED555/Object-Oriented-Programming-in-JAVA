public class Question_9 {
    public static void main(String[] args) {
        String  str = "Java is a widely-used programming language for coding web applications. It has been a popular choice among developers for over two decades, with millions of Java applications in use today.";
        String WordToFinder1 = "is ";
        String WordToFinder3 = "popularity";

        int result = str.indexOf(WordToFinder1);
        
        System.out.print("Check word which is present in string.\n");    
        if (result != -1) {
            System.out.print("Word is Found in Sentence.\n");
        }else 
        System.out.print("Word is not found at string\n");
        
        result = str.indexOf(WordToFinder3);

        System.out.print("Check word which is not present in string.\n");    
        if (result != -1) {
            System.out.print("Word is Found in Sentence.\n");
        }else 
        System.out.print("Word is not found at string\n");
    }
}
