import java.util.Scanner;
public class Question11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter Gb to convert in Bytes");
		double	gb = input.nextInt();
		double byt=gb*1024*1024*1024;	
		System.out.println("Converting gb to byte " + byt);
			
		System.out.println("enter Dollar to convert in Rupee");
		double dollar = input.nextInt();
		double rupee=dollar*280;
		System.out.println("Converting dollar to rupee " + rupee);
		
		
		System.out.println("enter Feet to convert in Inches");
		double feet = input.nextInt();
		double inches=feet*12;
		System.out.println("Converting Feet to Inches " + inches);
		
		System.out.println("enter Meter to convert in Centimeter");
		double meter = input.nextInt();
		double centimeter=meter*100;
		System.out.println("Converting Meter to Centimeter " + centimeter);
		
		System.out.println("enter hours to convert in Second");
		double hour = input.nextInt();
		double second=hour*3600;
		System.out.println("Converting Hour to Second " + second);
		
		
		input.close();
	}
}