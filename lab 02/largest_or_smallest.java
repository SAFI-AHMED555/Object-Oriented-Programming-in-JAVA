import java.util.Scanner;
public class largest_or_smallest {
    public static void main(String[]args){
        try (Scanner decision = new Scanner(System.in)) {
            System.out.print("Enter the First number : ");
            int number1 = decision.nextInt();
            System.out.print("Enter the Second number : ");
            int number2 = decision.nextInt();
            System.out.print("Enter the Third number : ");
            int number3 = decision.nextInt();
            System.out.print("Enter the Fourth number : ");
            int number4 = decision.nextInt();
              if(number1 > number2){
                    if (number1>number3) {
                        if (number1>number4) {
                         System.out.println("The largest number of all four number is  " + number1);   
                        } 
                    }
                }
                 if(number2 > number1){
                    if (number2>number3) {
                        if (number2>number4) {
                         System.out.println("The largest number of all four number is  " + number2);   
                        } 
                    }
                }
                 if(number3 > number1){
                    if (number3>number2) {
                        if (number3>number4) {
                         System.out.println("The largest number of all four number is  " + number3);   
                        } 
                    }
                }
                  if(number4 > number1){
                    if (number4>number2) {
                        if (number4>number3) {
                        System.out.println("The largest number of all four number is  " + number4);   
                        } 
                    }
                }
                
                // for shortest number find
              if(number1 < number2){
                    if (number1 < number3) {
                        if (number1 < number4) {
                         System.out.println("The smallest number of all four number is  " + number1);   
                        } 
                    }
                }
                 if(number2 < number1){
                    if (number2 < number3) {
                        if (number2 < number4) {
                         System.out.println("The smallest number of all four number is  " + number2);   
                        } 
                    }
                }
                 if(number3 < number1){
                    if (number3 < number2) {
                        if (number3 < number4) {
                         System.out.println("The smallest number of all four number is  " + number3);   
                        } 
                    }
                }
                   if(number4 < number1){
                    if (number4 < number2) {
                        if (number4 < number3) {
                         System.out.println("The smallest number of all four number is  " + number4);   
                        } 
                    }
                }
        }
            
    }
}