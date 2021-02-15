import java.util.Scanner;
public class Tutorial {
	public static void main(String[] args){
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
	}
	public static void question2(){
		int runningTotal = 0;
		runningTotal += 5;
		runningTotal += 8;
		runningTotal += 2;
		runningTotal += 3;
		System.out.println(runningTotal);
	}
	public static void question3(){
		// minimum values
		byte myByteMin = -128;
		short myShortMin = -32768;	
		int myIntMin = -2147483648;
		long myLongMin = -9223372036854775808l;
		float myFloatMin = 3.4e-038f;
		double myDoubleMin = 1.7e-308;
		// maximum values
		byte myByteMax = 127;
		short myShortMax = 32767;
		int myIntMax = 2147483647;
		long myLongMax = 9223372036854775807l;
		float myFloatMax = 3.4e+038f;
		double myDoubleMax = 1.7e+308;
		// boolean myBoolean = true;
		// char myChar = 'A';
		System.out.println(myByteMin - 1);
		System.out.println(((Object)(myByteMin - 1)).getClass().getName());
		System.out.println(myByteMax + 1);
		System.out.println(((Object)(myByteMax + 1)).getClass().getName());
		System.out.println(myShortMin - 1);
		System.out.println(((Object)(myShortMin - 1)).getClass().getName());
		System.out.println(myShortMax + 1);
		System.out.println(((Object)(myShortMax + 1)).getClass().getName());
		System.out.println(myIntMin - 1);
		System.out.println(((Object)(myIntMin - 1)).getClass().getName());
		System.out.println(myIntMax + 1);
		System.out.println(((Object)(myIntMax + 1)).getClass().getName());
		System.out.println(myLongMin - 1);
		System.out.println(((Object)(myLongMin - 1)).getClass().getName());
		System.out.println(myLongMax + 1);
		System.out.println(((Object)(myLongMax + 1)).getClass().getName());
		System.out.println(myFloatMin - 1);
		System.out.println(((Object)(myFloatMin - 1)).getClass().getName());
		System.out.println(myFloatMax + 1);
		System.out.println(((Object)(myFloatMax + 1)).getClass().getName());
		System.out.println(myDoubleMin - 1);
		System.out.println(((Object)(myDoubleMin - 1)).getClass().getName());
		System.out.println(myDoubleMax + 1);
		System.out.println(((Object)(myDoubleMax + 1)).getClass().getName());
		// “The type of each value is converted to type of the higher type in the expression”
	}
	public static void question4(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mark1 => ");
		int mark1 = input.nextInt();
		System.out.print("Enter mark2 => ");
		int mark2 = input.nextInt();
		System.out.print("Enter mark3 => ");
		int mark3 = input.nextInt();

		double average = (mark1 + mark2 + mark3)/3;
		System.out.println("Average is " +  average);
	}
	public static void question5(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length => ");
		double length = input.nextDouble();
		System.out.print("Enter height => ");
		double height = input.nextDouble();
		System.out.print("Enter width => ");
		double width = input.nextDouble();

		double volume = (length * height * width);
		System.out.println("Volume is " +  volume);
	}
	public static void question6(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter meters value => ");
		double meters = input.nextDouble();
		double centimeters = (meters * 100);
		System.out.println(centimeters + " cm");
	}
	public static void question7(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Centigrade value => ");
		double centigrade = input.nextDouble();
		double fahrenheit = (9.0/5)*(centigrade) + 32;
		System.out.println(fahrenheit + " *F");	
	}
	public static void question8(){
		double v1 = 3.1428;
		System.out.println(Math.round(v1 * 100.0) / 100.0);
		System.out.printf("%.2f", v1);
	}
	public static void question9(){
		final int MANUAL_AMOUNT = 500;
		final int SKILLED_AMOUNT = 700;
		final int MANAGEMENT_AMOUNT = 800;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter manual people count => ");
		int manualCount = input.nextInt();
		System.out.print("Enter skilled people count => ");
		int skilledCount = input.nextInt();
		System.out.print("Enter management people count => ");
		int managementCount = input.nextInt();

		long totalWage = (manualCount * MANUAL_AMOUNT) + (skilledCount * SKILLED_AMOUNT) + (managementCount * MANAGEMENT_AMOUNT);
		System.out.println("Wage: " + totalWage);
		double tax = totalWage * 0.2;
		System.out.println("Tax: " + tax);
	}
	public static void question10(){
		double number = 1234567.456;
		System.out.printf("%,.1f", number);
	}	
}
