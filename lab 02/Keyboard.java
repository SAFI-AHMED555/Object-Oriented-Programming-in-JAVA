import java.util.Scanner;
public class Keyboard {
/**
 * @param args
 */
public static void main(String[] args) {
         try (Scanner Inputnum  = new Scanner(System.in)) {
            System.out.println("Enter 1st number : ");
            int num1 = Inputnum.nextInt();
             System.out.print("Enter 2nd number : ");
             int num2 = Inputnum.nextInt();
             System.out.print("Enter Operator : ");
             char sign = Inputnum.next().charAt(0);
   
             switch (sign) {
                 case '+':
                     int add = num1 + num2;
                     System.out.println("Addition : " + add);
                     break;
                 case '-':
                     int sub = num1 - num2;
                     System.out.println("Substraction : " + sub);
                     break;
                 case '*':
                     int multiply = num1 * num2;
                     System.out.println("Multiplication : " + multiply);
                     break;
                 case '/':
                     double divide = num1 / num2;
                     System.out.println("Division : " + divide);
                     break;
             }
        }
}
}
