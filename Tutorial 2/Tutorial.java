import java.util.Scanner;
public class Tutorial {
	public static void main(String[] args){
		question1();
		question3();
		question4();
		question5();
		question6();
		question8();
		question9();
		question10();
	}
	public static void question1(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature => ");
		int temp = input.nextInt();
		String value = (temp > 50) ? "Hot" : "Cold";
		System.out.println(value);
	}
	public static void question3(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter marks => ");
		int marks = input.nextInt();
		if(marks < 25) {
			System.out.println("F");
		} else if(marks < 45) {
			System.out.println("E");
		} else if(marks < 50) {
			System.out.println("D");			
		} else if(marks < 60) {
			System.out.println("C");			
		} else if(marks < 80) {
			System.out.println("B");			
		} else {
			System.out.println("A");
		}
	}
	public static void question4(){
		int x = 2;
		int y = 5;
		int z = 0;
		System.out.println(x == 2);
		System.out.println(x != 5);
		System.out.println(x != 5 && y >= 5);
		System.out.println(z != 0 || x == 2);
		System.out.println(!(y < 10));
	}
	public static void question5(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Character => ");
		char letter = input.next().charAt(0);
		String value = (Character.isUpperCase(letter)) ? "UPPERCASE" : "LOWERCASE";
		System.out.println(value);
	}
	public static void question6(){
		boolean item1 = !((i<10) || (v>=50));
		boolean item2 = ((i >= 10) && (x < 50));
		System.out.println(item1 == item2);
	}
	public static void question8(){
		int x= 0;
		int y= 0;
		for (int i = 0; i < 5; i++) {
			if (( ++x > 2 ) && (++y > 2)){
				x++;
			}
		}
		System.out.println(x + " " + y);

		///////////////////////////////

		x= 0;
		y= 0;
		for (int i = 0; i < 5; i++) {
			if (( ++x > 2 ) || (++y > 2)) {
				x++;
			}
		}
		System.out.println("x="+x+" y="+y);
	}
	public static void question9(){
		int i = 1;
		i += ++i + i++ + ++i;
		int j = 1;
		j += ++j + j++ + ++j;
		int k = 1;
		k += k++ + k++ + ++k;
		int m = 1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}
	public static void question10(){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		switch (month) {
			case 1: 
				System.out.println("Jan 31");
				break;
			case 2: 
				System.out.println("Feb 29/28");
				break;
			case 3: 
				System.out.println("Mar 31");
				break;
			case 4: 
				System.out.println("Apr 30");
				break;
			case 5: 
				System.out.println("May 31");
				break;
			case 6: 
				System.out.println("June 30");
				break;
			case 7: 
				System.out.println("July 31");
				break;
			case 8: 
				System.out.println("Aug 31");
				break;
			case 9: 
				System.out.println("Sep 30");
				break;
			case 10: 
				System.out.println("Oct 31");
				break;
			case 11: 
				System.out.println("Nov 30");
				break;
			case 12: 
				System.out.println("Dec 31");
				break;
			default: 
				System.out.println("Invalid Input");
				break;
		}
	}	
}

// question - 7

import java.util.Scanner;
class TestPositive {
	public static void main(String [] args) {
		System.out.println("------------1");
		program1();
		System.out.println("------------2");
		program2();
		System.out.println("------------3");
		program3();
	}
	public static void program1() {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int x = S.nextInt();
		if (x > 0) {
			System.out.println("The value is positive:");
		}
		else {
			if (x < 0) {
				System.out.println("The value is negative:");
			}
			else {
				System.out.println("The value is zero:");
			}
		}
		System.out.println("Good Bye!");
	}

	public static void program2() {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int x = S.nextInt();
		if (x > 0) {
			System.out.println("The value is positive:");
		}
		if (x < 0) {
			System.out.println("The value is negative:");
		}
		else {
			System.out.println("The value is zero:");
		}
		System.out.println("Good Bye!");
	}

	public static void program3() {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int x = S.nextInt();
		if (x > 0) {
			System.out.println("The value is positive:");
		}
		if (x < 0) {
			System.out.println("The value is negative:");
		}
		if (x ==0) {
			System.out.println("The value is zero:");
		}
		System.out.println("Good Bye!");
	}
}
