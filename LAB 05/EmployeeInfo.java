
import java.util.Scanner;

public class EmployeeInfo {
    public double baseSalary;
    public int hoursOfWork;
    public double finalSalary;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base salary: $");
        baseSalary = scanner.nextDouble();

        System.out.print("Enter the number of hours worked per day: ");
        hoursOfWork = scanner.nextInt();

    }
   
    public void display() {
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Hours Worked: " + hoursOfWork );
        if (hoursOfWork > 6) {
            baseSalary+= 5;
        System.out.println("Final Salary: $" + baseSalary);
        }
    }

    public static void main(String[] args) {
        EmployeeInfo employee = new EmployeeInfo();
        employee.getInfo();
        employee.display();
    }
}