import java.util.*;
public class Natural_Number {
    public static void main(String args[]){
        try (Scanner Natural = new Scanner(System.in)) {
          int Num,sum=0;
           System.out.println("Enter Natural Number : ");
          Num=Natural.nextInt();
          for(int i=1;i<=Num;i++){
            sum+=i;
          }
        }
      System.out.println("Sum : "+sum);
  }  

}



