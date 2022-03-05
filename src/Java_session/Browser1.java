package Java_session;

public class Browser1 {
	// main method will never return anything because it is static and default in nature
	// write the requirements :
	// launch a browser
	// input parameter : name(String) : chrome/safari/edge/ee/firefox
	//return : void 
	
	public boolean launchBrowser(String name) {
		System.out.println("browser name is:" + name);
		if (name.equals("chrome")) {
		System.out.println("launch chrome");
		return true;
		}
		else if(name.equals("firefox")) {
			System.out.println("launch firefox");
			return true;
		}
		else if(name.equals("safari")) {
			System.out.println("launch safari");
			return true;
		}
		else if(name.equals("IE")) {
			System.out.println("IE");
			return true;
		}
		else {
			System.out.println("please pass the right browser");
			return false;
		}
	}
	
	// using switch case statement
	// return and brake cannot be used together
	      
	public boolean openBrowser(String brName) {
		
		System.out.println("browser name:"+ brName);
		switch (brName) {
		case "chrome":
			System.out.println("launch chrome");
			return true;
		case "safari":
			System.out.println("launch safari");
			return true;
		case "firefox":
			System.out.println("launch firefox");
			return true;
		case "IE":
			System.out.println("launch IE");
			return true;

		default:
			System.out.println("plz pass the right browser:" + brName);
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser1 br = new Browser1();
		if(br.launchBrowser("opera")) {
		System.out.println("br is launched..");}
		else {
			System.out.println("TC is failed..");
		}
        //Note : Function cannot return multiple things(like string , boolean,integer) at time
		
		// using switch case statement
		Browser1 brName = new Browser1();
		boolean flag = brName.openBrowser("opera");
		System.out.println(flag);
		
	}
	

}
