import java.util.*;
public class Perfect_Num {
    public static void main(String args[]){
        try (Scanner Perfect = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int num=Perfect.nextInt(),sum=0;
            
            for(int i=2;i<=num;i++){
                sum+=i;
            }
             if(sum==(num * num)){
                System.out.println("Perfect Number");
            }else{
                System.out.println("Not a Perfect number");     
             }
        }

   }
}
