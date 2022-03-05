package Java_session;

public class Assignment {

	public static void main(String[] args) {

		// 1)Write a Java program to print 'Hello' on screen and then print your name on
		// a
		// separate line.
		String a = "Hello";
		String b = "Parag Chougule";
		System.out.println(a + b);

		// 2) Write a Java program to print the sum of two numbers.
//		int x = 100;
//		int y = 200;
//		System.out.println(x + y);
		// 3.Write a Java program to divide two numbers and print on the screen.
//		int x1 = 50;
//		int y1 = 3;
//		System.out.println(x1/y1);

		// 3)Write a Java program to print the result of the following operations.
		// Change your test data accordingly.
//		Test Data:
//			a. -5 + 8 * 6
//			b. (55+9) % 9 
//			c. 20 + -3*5 / 8 
//			d. 5 + 15 / 3 * 2 - 8 % 3 

//		int a1 = 5;
//		int a2 = 8;
//		int a3 = 6;
//		System.out.println(-a1+a2*a3);
//		int a4 = 55;
//		int a5 = 9;
//		System.out.println((a4+a5) % a5);
//		int a6 = 3;
//		int a7 = 15;
//		int a8 = 2;
//		System.out.println(a1+a7/a6*a8-a2%3);

		// 4) Write a Java program to compute the specified expressions and print the
		// output. Go to the editor
		// Test Data:
		// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		double x1 = 25.5;
//		double x2 = 3.5;
//		double x3 = 4.5;
//		double x4 = 40.5; {
//			System.out.println((x1*x2-x2*x2)/(x4-x3));
//		}

		// 5) Create three int variables having values like : 100, 200, 3400. Add them
		// and concatenate and generate this output String : 
//		  "Your Total amount is. 3700".
//		int x = 100;
//		int y = 200;
//		int z = 3400;	
//		System.out.println(x+y+z);
//		String w = "Your total amount is 3700";
//		System.out.println(w);

		// 6)What should be the output for :
		// byte b3 = 065;
//		byte b3 = 065;

//		System.out.println(b3);//no starts with '0' is octal number therefore o/p - 53
//		// 7) Take three numbers from the user and print the greatest number. 
//            Test Data
//            Input the 1st number: 25 
//            Input the 2nd number: 78 
//            Input the 3rd number: 87
//		int a1 = 25;
//		int a2 = 78;
//		int a3 = 78;
//		if (a3 > a2) {
//			System.out.println("this is greatest");
//		}
//		else {
//			System.out.println(" this is smallest");
//		}

		// 8) Write a Java program to test a number is positive or negative.

//		int x = 35;
//		int y = -11;
//		if (x > 0) {
//			System.out.println("this is even no");
//		}
//		if (y < 0) {
//			System.out.println("this is odd no");
//		}

		// 9)Write a program to print the following pattern using for loop:
//		    00 01 02 03 04 05 06 07 08 09 
//		    10 11 12 13 14 15 16 17 18 19 
//		    20 21 22 23 24 25 26 27 28 29 
//		    30 31 32 33 34 35 36 37 38 39 
//		for (int i=01; i<40; i++ ) {
//			System.out.println(i);
//		}
//		int k = 1;
//		for(;k < 40;) {
//			System.out.println(k);
//			k++;
//		}

		// 10) Write a program to create a static Array, having following cricket data:
		// name(String), age(age), team name(String), DOB(String), gender(char), Strike
		// Rate(Double), isActive(boolean)
		// Try to create multiple Object Arrays for different players 
		// Try to print all the values of each player on the console using normal
		// for/while loop and for each loop

//		Object crt[] = new Object[7];
//		
//		crt[0] = "Name";
//		crt[1] = 45;
//		crt[2] = "Team name";
//		crt[3] = 'M';
//		crt[4] = 25.34;
//		crt[5] = true;
//		crt[6] = "8/12/1995";
//		
//		for (Object e : crt) {
//			System.out.println(e);
//		}

//		// 11) Try to print the following pattern on the console:
////		        n = 4
////				n = 3
////				n = 2
////				n = 1
////				n = 0
//		int m[] = new int[4];
//		System.out.println(m);// unsolved 

		// 12)Array List -
//		1)1. Write a Java program to create a new array list, add some colors (string) and print out the collection
//		String clr[] = new String [4];
//		
//		clr[0] = "Red";
//		clr[1] = "Blue";
//		clr[2]	= "Green";
//		clr[3]	= "Yellow";
//		
//		for(String e : clr) {
//			System.out.println(e);
//		}
		// 13) Write a program to print the circumference and area of a circle of radius
		// entered by user by defining your own method.
		// circumference of area = 3.14*2*r
		// area of circle = 3.14*r*r

		double a1 = 3.14 * 2 * 30;
		double a2 = 3.14 * 30 * 30;
		{
			System.out.println(a1);
			System.out.println(a2);
		}
		// 14. Check no is even or odd
		int num = 11;
		if (num % 2==0) {
			System.out.println(" the no is even");
		}
		else {
			System.out.println("the no is odd");
		}
            
		
	}
}
