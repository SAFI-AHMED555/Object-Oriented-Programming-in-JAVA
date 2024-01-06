import java.util.Scanner;
public class Number_of_terms {
    public static void main(String args[]){
        try (Scanner Term = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int Var = Term.nextInt(),neg=-1,pos=4;
            
            for(int i=1;i<=Var;i++){
                if(i%2==1){
                    System.out.print(neg);neg-=(6);
                } else { 
                    System.out.print(pos);pos+=6;
                } if(i!=Var){System.out.print(",");
                 }
            }
        }      
    }

}
