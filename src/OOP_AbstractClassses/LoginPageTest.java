package OOP_AbstractClassses;

public class LoginPageTest {

	public static void main(String[] args) {


		LoginPage lp = new LoginPage(10);
		lp.doLogin("admin", "admin");
		lp.forgotPwd();
		lp.calculatePrice();
		Page.logo();
		lp.loading();
		lp.javaScriptLoading(); 
		
		// top casting : Possible
		Page p = new LoginPage();
		p.calculatePrice();
		p.doLogin("admin","test123");
		p.title();
		p.url();
		
		//down casting:NA
		
		

	}

}
