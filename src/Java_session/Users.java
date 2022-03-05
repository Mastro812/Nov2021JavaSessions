package Java_session;

public class Users {
	
	//methods : part of class data member
	// method should be parallel to each other
	// method cannot be created inside a method
	// cannot create a duplicate method - but I can overload
	
	// Types
	// 1. No input and no return:
	// return type : void ( Note : Void and return cannot be together)
	//void : cannot return anything
	public void test() {
		System.out.println("test Method");
	}

	
	// 2, No input and some return
	// return type : integer
	public int getNumber() {
		System.out.println("get number method");
		return 100;
		
	}
	public String getTrainerName() {
		System.out.println("get trainer name");
		return "Naveen";
		
	}
	public boolean isForgotPasswordLinkExist() {
		System.out.println("Checking forgot password link");
		return true;
		
	}
	
	// 3. Some input and some return
	public int add(int a,int b) {
		System.out.println("add method");
		int c = a + b;// a and b are called method parameters
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users obj = new Users ();
		obj.test();
		int num = obj.getNumber();
		System.out.println(num);//100
		boolean flag = obj.isForgotPasswordLinkExist();
		System.out.println(flag);
		if (flag) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		int sum = obj.add(10, 20);// here actual values 10 and 20 are called arguments
		System.out.println(sum);
		
		sum = obj.add(30, 40);
		System.out.println(sum + 40);//110
		
		

	}
	

}
