package Java_session;

public class PageClass {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");
		PageClass.t2();
		PageClass.t3();
		
	}
	
	public static void t1() {
		System.out.println("t1");
		t2();
		PageClass p2 = new PageClass();
		p2.m1();
	}

	public static void t2() {
		System.out.println("t2");
		t3();
	}

	public static void t3() {
		System.out.println("t3");	
	}

	public static void main(String[] args) {
		PageClass p1 = new PageClass();
		p1.m1();
		t1();
		

	}

}
