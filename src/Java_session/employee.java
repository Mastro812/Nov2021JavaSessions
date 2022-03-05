package Java_session;

public class employee {
	
	String name;
	int age;
	double salary;
	 

	public static void main(String[] args) {
		employee e1 = new employee();
		e1.name = "Shikha";
		e1.age = 25;
		e1.salary = 30.44;
		
		employee e2 = new employee();
		e2.name = "Ram";
		e2.age = 28;
		e2.salary = 23.44;
		
		employee e3 = new employee();
		e3.name = "Shiva";
		e3.age = 29;
		e3.salary = 43.44;
		
		System.out.println(e1.name + " " +e1.age + "  " + e1.salary);
		System.out.println(e2.name + " " +e2.age + "  " + e2.salary);
		System.out.println(e3.name + " " +e3.age + "  " + e3.salary);
		
		System.out.println("------------");
		
		e1 = e2;
		
		System.out.println(e1.name + " " +e1.age + "  " + e1.salary);
		System.out.println(e2.name + " " +e2.age + "  " + e2.salary);
		System.out.println(e3.name + " " +e3.age + "  " + e3.salary);
		
		System.out.println("------------");
		
		e2 = e3;
		
		System.out.println(e1.name + " " +e1.age + "  " + e1.salary);
		System.out.println(e2.name + " " +e2.age + "  " + e2.salary);
		System.out.println(e3.name + " " +e3.age + "  " + e3.salary);
		
		System.out.println("------------");
		
		e3 = e1;
		System.out.println(e1.name + " " +e1.age + "  " + e1.salary);
		System.out.println(e2.name + " " +e2.age + "  " + e2.salary);
		System.out.println(e3.name + " " +e3.age + "  " + e3.salary);
		
//		new employee();
//		new employee();
		employee e4 = new employee();
		e4 = null;// this type of objects are called null reference object.
	//	System.out.println(e4.name);//Null pointer exception
	}

}
