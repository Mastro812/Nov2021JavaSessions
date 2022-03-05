package Java_session;

public class B {

	public static void main(String[] args) {
		System.out.println("B--main");
		A.main(args);//java.lang.StackOverflowError

	}

}
