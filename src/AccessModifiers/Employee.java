package AccessModifiers;

public class Employee {
	
	public String name;
	private int salary;
	String city;
	protected String dob;
	
	

	public static void main(String[] args) {


		Employee e = new Employee();
		e.name = "Tom";
		e.salary =5000;
		e.city = "Mumbai";
		e.dob = "08/12/1995";
		

	}

}
