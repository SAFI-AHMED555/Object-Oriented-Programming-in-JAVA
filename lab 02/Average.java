import java.util.Scanner;
public class Average {
    /**
     * @param args
     */
    public static void main(String []args){
     try (Scanner Var1 = new Scanner(System.in)) {
        System.out.println("Enter Length of Number :" );
         int Var2 = Var1.nextInt();
         int Var3 = 0;
         for(int Var4 = 1;Var4 <= Var2;++Var4){
           System.out.println("Please enter "+Var4 +" number: ");
           int Var5=Var1.nextInt();
           Var3 = Var3 + Var5; 
         }
         double Var6 = (double)(Var3 / Var2 ) ;
         System.out.println("The Average of " + Var2 + " number is : " + Var6);
    }
    }
}
