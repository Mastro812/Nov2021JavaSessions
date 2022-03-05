package Java_session;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.While loop
		// 1 to 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			// i++;
			// i = i+1;
			++i;
		}
		//Use cases : when we are not sure about how many iterations we have to perform
		//page loading
		//Web element is coming after 5/10/15/20 secs 
		//pagination:
		// waiting for server to respond
		//carousel handling
		

		// infinite loop concept
		// while (true) {
		// System.out.println("Welcome to Taj Hotel - 24 x 7");
		// }
		// System.out.println("bye");

		boolean flag = true;
		int num = 1;
		while (flag) {
			System.out.println("Welcome to Taj Hotel - 24 x 7");
			num++;
			if (num == 6) {
				break;
			}
		}

		System.out.println("----------------");
		// 2.For loop
		// 1 to 10
//		for (int k=1; k<=10; k++) {
//			System.out.println(k);
//			
//		}
//		int k = 1;
//		for (; k <= 10; k++) {
//			System.out.println(k);
//		}
		int k = 1;
		for (; k <= 10;) {
			System.out.println(k);
			k++;
		}
//		System.out.println("------------");
//		for(;;) {
//			System.out.println("Hello");// it will print hello for infinite times
//		}
		
	// doubles used in for loop
		
//		for(double d=1.1; d<=10.5; d++) {
//			System.out.println(d);
//		}
		System.out.println("------------");
	// characters used in for loop
		for(char c='a'; c<='z'; c++) {
			System.out.println(c+ ":"+ (int)c);
		}
		System.out.println("------------");
		
		for(char c1='A'; c1<='Z'; c1++) {
			System.out.println(c1+ ":"+ (int)c1);
		}
		
		System.out.println("------------");
		
		// want to print odd numbers like 1,3,5,7,9
		for(int odd=1; odd<=9; odd= odd + 2) {
			System.out.println(odd);
		}
		// home work 
		// num % 2 == 0 --even (0.2.4.6.8.10)
		// num % 2 == 1 -- odd  (1.3.5.7.9)
		System.out.println("------------");
		for (int l=1; l<=100; l++) {
			System.out.println(l);
			if (l%5 == 0) {
				System.out.println("hi");
			}
		}
		//use cases : we have to use for loop when we know how many iterations we have to perform
		//drop down : jan to dec (1 to 12)
		
		//3.Do while loop
		int p=1;
		do {
			System.out.println(p);
			p++;
		} 
		while (p<=10);//1,2,3,4,5,6,7,8,9,10
		System.out.println("------------");
		int p1=1;
		do {
			System.out.println(p1);
			p1++;
		} 
		while (p1>=10);
		
		System.out.println("------------");
		int p2=1;
		do { ++p2;
			System.out.println(p2);
			
		} 
		while (p2<=10);// 2,3,4,5,6,7,8,9,10,11
	}
}
