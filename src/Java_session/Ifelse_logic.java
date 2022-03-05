package Java_session;

public class Ifelse_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String browser = "opera";
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		else if (browser.equals("ff")) {
			System.out.println("Launch ff");
		}
		else if (browser.equals("safari")) {
			System.out.println("Launch safari");
		}
		else if (browser.equals("ie")) {
			System.out.println("Launch ie");
		}
		else {
			System.out.println("please pass the right browser");
		}
		

	}

}
