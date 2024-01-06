import java.util.Scanner;
public class Number_divisible {
    public static void main(String[] args){

    Scanner Divisible = new Scanner(System.in);
    System.out.print("Please enter a number :");
    int number = Divisible.nextInt();

    if(number%5==0 && number%11==0){
        System.out.println("the number  is divisible by both 5 and 11");
    }else{
        System.out.println("The number is not divisible by 5 and 11 ");
    }
       Divisible.close();

   } 
}