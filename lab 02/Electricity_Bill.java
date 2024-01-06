import java.util.Scanner;
public class Electricity_Bill {

    public static void main(String[] args) {
        try (Scanner Calculation = new Scanner(System.in)) {
            System.out.println("Enter Meter Number: ");
            int meter_Number = Calculation.nextInt();
            Calculation.nextLine(); 
            System.out.println("Enter Owner Name: ");
            String owner_Name = Calculation.nextLine();

            System.out.println("Enter Electricity Unit Charges: ");
            int units = Calculation.nextInt();

            double total_Bill;

            if (units <= 100) {
                total_Bill = units * 5;
            } else if (units <= 200) {
                total_Bill = 100 * 5 + (units - 100) * 10;
            } else if (units <= 300) {
                total_Bill = 100 * 5 + 100 * 10 + (units - 200) * 15;
            } else {
                total_Bill = 100 * 5 + 100 * 10 + 100 * 15 + (units - 300) * 20;
            }

            double ptv_Sports_Charge = 0.02 * total_Bill;
            total_Bill = total_Bill + ptv_Sports_Charge + 2000; 

            // Display the result
            System.out.println("\nElectricity Bill Details");
            System.out.println("Meter Number: " + meter_Number);
            System.out.println("Owner Name: " + owner_Name);
            System.out.println("Total Bill: Rs. " + total_Bill);
        }

    
    }
}
