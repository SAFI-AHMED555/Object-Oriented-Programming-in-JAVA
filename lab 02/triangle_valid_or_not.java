import java.util.Scanner ;
public class triangle_valid_or_not {
    public static void main (String[] args){
        Scanner shape =new Scanner(System.in) ;
        System.out.println("Enter the First Angle of the Triangle: ");
        int angle_1 = shape.nextInt();
        System.out.println("Enter the Second Angle of the Triangle: ");
        int angle_2 = shape.nextInt();
        System.out.println("Enter the Third Angle of the Triangle: ");
        int angle_3 = shape.nextInt();
        if (angle_1==90 || angle_2==90 ||angle_3==90 ) {
            System.out.println("Your Triangle is Valid & it's a Right-angle triangle ");
            } else if(angle_1>90 || angle_2>90 ||angle_3>90){
                 System.out.println("Your Triangle is Valid & it's an Obtuse-angle triangle ");
                } else if (angle_1<90 || angle_2<90 || angle_3<90){
                     System.out.println("Your Triangle is Valid & it's an Acute-angle triangle ");
                } else {
                    System.out.println("Invalid angle .This angle do not form a valid triangle. Please try again");
                 }
                 shape.close();
    }
    
}
