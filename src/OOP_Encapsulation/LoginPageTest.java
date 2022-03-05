package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user 1: Naveen
		LoginPage u1 = new LoginPage("naveenauto","tet123");
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());
		//user 2:
		LoginPage u2 = new LoginPage("Shabeer","Shabeer123");
		System.out.println(u2.getUsername());
		System.out.println(u2.getPassword());
		
		// to update password of shabeer
		u2.setPassword("selenium123");
		System.out.println(u2.getUsername());
		System.out.println(u2.getPassword());
		
		u2.doLogin(u2.getUsername(), u2.getPassword());
		
		LoginPage u3 = new LoginPage("Paragauto","Test123");
		u3.doLogin();
		
		Browser br = new Browser();
		br.launchBrowser();
	}
	

}

