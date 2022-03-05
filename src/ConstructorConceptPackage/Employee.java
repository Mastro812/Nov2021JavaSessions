package ConstructorConceptPackage;

public class Employee {
	
	String name;
	int age;
	String empId;
	String Dept;
	
	//1.Constructor name will be same as class name.
	//2.Constructor will not have any return type/no void/no return keyword
	//3. it look like a function but not a function
	//4.constructor overloading is possible
	//5.constr.. will be called when you create the object
	//default const..depends on use cases..N no of objects..
	
	
	// constructor v/s function
	//const.. name will remain same..but function name can be anything
	//const..will never have any return but funct..may or may not return the value
	//const.. will be called when you create the object but funct/method.. will be called with object reference.
	//const..will help to create object of the class,we can restrict unnecessary object creation
	//funct..should have business logic,should define the feature of the class but the const.. should not have any business logic
	public Employee() {//0 parameter
		System.out.println("default constructor");
	}
	public Employee(int i) {//1 parameter
		System.out.println("1 param const:" + i);
	}
	public Employee(int i,String p) {//2 parameter
		System.out.println("2 param const:"+(i+p));
	} 

	public static void main(String[] args) {
		Employee e1 = new Employee(10,"test");
		Employee e2 = new Employee(10);
		Employee e3 = new Employee();
		

	}

}
