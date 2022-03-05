package ConstructorConceptPackage;

public class ConstructorCalling {

	String name;//naveen >> tom
	int age;
	double salary;

//create const.. -- right click + source + generate const..using fields
	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
		
		this("naveen");//Constructor call must be the first statement in a constructor
		//this.name = name;
		this.age = age;
		this.salary = salary;
		
	}

	public ConstructorCalling(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCalling obj = new ConstructorCalling("Tom",22,222.25);
		System.out.println(obj.name);

	}

}
