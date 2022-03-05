package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(25);
		e1.setSalary(12.33);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getInfo());
		
		e1.setInfo("Naveen",28,34.33);
		System.out.println(e1.getInfo());
		
	}
	

}
