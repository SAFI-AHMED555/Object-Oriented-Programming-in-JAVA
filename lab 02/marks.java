import java.util.Scanner ;
public class marks {
    public static void main (String[]args) {
        Scanner num1 =new Scanner(System.in);
        int cpMarks, dldMarks, isMarks, psMarks, csMarks, laagMarks;
        float total_Marks, percentage;
        String grade;
        System.out.println("Enter marks obtained in CP :");
        cpMarks = num1.nextInt();
        System.out.println("Enter marks obtained in DLD :" );
        dldMarks= num1.nextInt();
        System.out.println("Enter marks obtained in IS: ");
        isMarks = num1.nextInt();
        System.out.println("Enter marks obtained in PS: ");
        psMarks = num1.nextInt();
        System.out.println("Enter marks obtained in CS: ");
        csMarks = num1.nextInt();
        System.out.println("Enter marks obtained in LAAG: ");
        laagMarks = num1.nextInt();
        total_Marks = cpMarks + dldMarks + isMarks + psMarks + csMarks + laagMarks;
        percentage = (total_Marks/450)*100 ;
        if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 80 && percentage < 85) {
            grade = "A";
        } else if (percentage >= 75 && percentage < 80) {
            grade = "B+";
        } else if (percentage >= 70 && percentage < 75) {
            grade = "B";
        } else if (percentage >= 65 && percentage < 70) {
            grade = "C+";
        } else if (percentage >= 60 && percentage < 65) {
            grade = "C";
        } else if (percentage >= 55 && percentage < 60) {
            grade = "D+";
        } else if (percentage >= 50 && percentage < 55) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Percentage" + percentage + "%");
        System.out.println("Grade" +grade);
        System.out.println("Total Marks Obtained: " + total_Marks);
        num1.close();

    }
}