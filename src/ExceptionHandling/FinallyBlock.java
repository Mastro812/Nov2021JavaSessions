package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		int i = 0;
		try {
			i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		finally {
			System.out.println("this is finally block...");
			System.out.println(i);
		}

	}

}
