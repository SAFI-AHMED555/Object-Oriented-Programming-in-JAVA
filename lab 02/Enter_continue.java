import java.util.Scanner;
public class Enter_continue {
    public static void main(String args[]){
         try (Scanner Enter = new Scanner(System.in)) {
            for(int i=1;i<=100;i++){
              if(i%10==1&&i!=1){
                    System.out.print("\nPress Enter to continue");
                  }
                     System.out.print(i);
                    if(i!=100){
                       System.out.print(",");
                    }
            }
        }    
    }
}
 
