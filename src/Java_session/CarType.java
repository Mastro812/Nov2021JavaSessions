package Java_session;

public class CarType {
	String name;
	int price;
	String color;
	static int wheels;
	
	public static void start() {
		System.out.println("car -- start");
	}
	public void stop() {
		System.out.println("car -- stop");
	}

	public static void main(String[] args) {
		//we cannot use static in main method or local method and only used in class variable
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Black";
		c1.wheels = 4;
		System.out.println(c1.wheels);//the static field CarType wheels should be accessed in static way
		
		// how to access static variable
		//1.access directly
		System.out.println(wheels);
		//System.out.println(name);//cannot make a static reference to the non-static field name
		//2.access via class name
		System.out.println(CarType.wheels);
		// how to access static methods
		//1.access directly
		start();
		c1.stop();
		//2.access via class name
		CarType.start();
		
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.color = "Red";
		c2.wheels = 4;
		
		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
		c3.wheels = 4;
		

	}

}
