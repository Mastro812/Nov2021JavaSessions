package Java_session;

public class Ecom {
	//Method overloading
	//When we have different methods
	//1. within the same class
	//2.with same name
	//3. with different parameters
	//4. with different sequence/order of parameters
	// also called Poly(means 'Many') + morphism(means 'forms') - it is compile time(static) polymorphism
	// duplicates are not allowed in java.
	public int test() {//0
		System.out.println("test method");
		return 10;
	}
	public String test(int i) {//1
		System.out.println("test method :" + "IBM");
		return "IBM";                       // using return with different parameters doesn't affect overloading
	}
	public void test(String j) {//1
		System.out.println("test method");
	}
	public void test(int i,int j) {//2
		System.out.println("test method");
	}
	public void test(int j,double i) {//2
		System.out.println("test method");
	}
	public void test(int i,String j) {//2
		System.out.println("test method");
	}
	public void test(String i,int j) {//2
		System.out.println("test method");
	}
	
	// example Ecomm login page
	public void login() {
		
	}
    public void login(String un ,String pwd) {
		
	}
    public void login(String un ,String pwd,String role) {
		
	}
    public void login(String un ,String pwd , long pn) {
		
	}
    public void login(String socialMediaAccount ,int otp) {
		
	}
	// search
    public void search() {
    	
    }
    public void search(String productName , String colour) {
    	
    }
    public void search(String productName , String colour,int price) {
    	
    }
    // do payment
    public void dopayment(String upi) {
    	
    }
    public void dopayment(String upi,int otp) {
    	
    }
    public void dopayment(String cc,String pw) {
    	
    }
    public void dopayment(String paypal,String pw,int otp) {
    	
    }
    //uber : booking
    public void booking() {
    }
    public void booking(String st ,String end) {
    }
    public void booking(String st ,String end , String cartype) {
    }
    public void booking(String st ,String end , String cartype,int users) {
    }
    
    
    
	public static void main(String[] args) {
		
		Ecom obj = new Ecom();
		int n = obj.test();
		System.out.println(n); // 0 parameter
		
		obj.test(100);

	}

}
