package OOP_AbstractClassses;

public class LoginPage extends Page{
	public LoginPage() {
		System.out.println("LP--default constructor....");
	}
	
	public LoginPage(int i) {
		System.out.println("LP--one param constructor...."+ i);
		
	}
	@Override
	public void title() {
		System.out.println("LP--title");
		
	}

	@Override
	public void url() {
		System.out.println("LP--url");
		
	}
	
	public void forgotPwd() {
		System.out.println("LP--forgot pwd");
	}
	
	public void loading() {
		System.out.println("LoginPage--loading in 10 seconds..");
	}

	@Override
	public void javaScriptLoading(){
		System.out.println("LP--javaScriptLoading");
		
	}


}
