package OOP_Encapsulation;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	//Getter and setter
	//right click + goto source + generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String  getInfo() {
		return name +":" + age +":" + salary;
	}
	public void setInfo(String name, int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name = "Tom";
		

	}

	

}
