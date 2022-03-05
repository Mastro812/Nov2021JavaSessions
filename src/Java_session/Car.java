package Java_session;

public class Car {
	
	// class properties - class variables/global variable
	String name;
	int price;
	String colour;
	String model;
	
	
	public static void main(String[] args) {
//		String name = "Parag";//local variable
//		System.out.println(name);
		
		// to access class variables/props you have to create object of the class. 
		// use new keyword
		
		Car c = new Car();// here c is reference object and main object is = RHS
		
		c.name ="BMW";
		c.price = 700;
		c.colour = "Metal Grey";
		c.model = "X5";
		System.out.println(c.name +" "+c.price +" " + c.colour + " " + c.model);
		
		Car c1 = new Car();
		System.out.println(c1.name +" "+c1.price +" " + c1.colour + " " + c1.model);
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.model = "Q5";
		System.out.println(c2.name +" "+c2.price +" " + c2.colour + " " + c2.model);
		
	}
	

}
