public class Question_2 {
    public static void main(String[]args){

        String special ="My_favourite_character is :Tony_$St@ark #1 2 3";
        String removespecial = special.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(removespecial);
    }
    
}
