package ExceptionHandling;

public class TryCatchBlock {
	String name;
	 

	// compile time - checked exception
	// run time exception - unchecked exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Thread.sleep(5000);
//		int i = 9/0;
//		int k[] =new int[2];
//		k[4] = 20;
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		 
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		
		try {
			obj.name = "harsh";
		}
		catch(NullPointerException e){
			System.out.println("NPE is coming");
			e.printStackTrace();
		}

		try {
			
			int i = 9/0 ;
			int k[] = new int[2];
			k[4] = 10;
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");//it will bypass this code & directly go to catch after try
			
			}  
//		catch(Throwable e) {
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic is coming");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOB is coming");
			e.printStackTrace();
 	    }
//		catch(NullPointerException e){
//			System.out.println("NPE is coming");
//			e.printStackTrace();
//		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
	}

}
