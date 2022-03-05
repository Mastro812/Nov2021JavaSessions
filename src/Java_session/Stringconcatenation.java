package Java_session;

public class Stringconcatenation {

	public static void main(String[] args) {
		
		char c = 'a';
		char h = 'b';
		System.out.println(c + h); 
		// Ans. is 195 because it consider the ASCII no of that character so
		// ASCII no of a = 97 and b = 98 Its only during performing arithmetic operations
		//ASCII numbers
		// a-z = 97 to 122
		// A-Z = 65 to 90
		// 0-9 = 48 to 57
		// to find out the ASCII no of character
		System.out.println((int)h);
		
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 23.44;
		
		System.out.println(a+b+x+y);
		System.out.println(x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(b-a);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(x+y+d1+d2+a+b);
		System.out.println(x+y+(d1-d2+a+b));
		
		int e = 10;
		int d = 2; 
		System.out.println(e/d);
		System.out.println(9.0/3);
		System.out.println(9/3.0);
		System.out.println(9.0/3.0);
		
		//System.out.println(9/0);//Arithmetic Exception
		System.out.println(9.0/0);//infinity
		System.out.println(9/0.0);//infinity
		System.out.println(9.0/0.0);//infinity
		
		//System.out.println(0/0);//Arithmetic Exception
		System.out.println(0.0/0.0);//NaN - not a number
		
		System.out.println(0/9);
		System.out.println(0/12.33);
		
		System.out.println(0.0/9);
		
		System.out.println(8 % 2);
		System.out.println(901 % 2);
		System.out.println(9.2 % 2);
		// it will give you the reminder value
		
		System.out.println(0.1+0.3);
		System.out.println(0.3+0.2);
		System.out.println(0.4+0.5);
		System.out.println(0.1+0.2);//Ans is 0.30000000000000004 because of decimal decision error
		

	}
}
