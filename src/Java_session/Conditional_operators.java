package Java_session;

public class Conditional_operators {

	public static void main(String[] args) {
		// Octal number - a number which has base 8
		// decimal number - a number which has base 10
		byte a = 065;
		System.out.println(a);
		// answer is 53
		byte b = 077;
		System.out.println(b);

		// If else conditional operator
		int x = 10;
		int y = 20;
		System.out.println(x == y);
		if (x == y) {
			System.out.println("PASS");
		} else {
			System.out.println("FALSE");
		}
//		if (false) {
//			System.out.println("hi");
//		} else {
//			System.out.println("bye");
//		}

		boolean flag = true;
		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("uft");
		}

		double d1 = 12.33;
		double d2 = 12.34;
		if (d1 == d2) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		String s1 = "hello";
		String s2 = "hello";
		if (s1.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("eqq");
		}

		if (s1 == s2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// FOR INTEGERS
		int total = 95;
		if (total <= 100) {
			if (total >= 95) {
				System.out.println("A++");
			} else {
				System.out.println("GRADE A");
			}
		}
	}

}
