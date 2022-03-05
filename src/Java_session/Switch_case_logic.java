package Java_session;

public class Switch_case_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String browser = "opera";
		 * switch ( browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ff":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the right browser");
			break;
		}
		 */
		String browser = " CHROME ";
		switch ( browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ff":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the right browser"+browser);
			break;
		}
		
		// SWITCH CASE FOR INTEGERS
		
		int total = 90;
		switch (total) {
		case 100 :
			System.out.println("A++");
			break;
		case 90 :
			System.out.println("A");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		//use of this
		//user level/user credentials/RBAC/permission
		//different test environments like - chrome,safari,firefox,ie
		//cross browser logic
		//cross devices
		//cross cloud testing - MS,AWS,GCP,LOCAL,DOCKER
		//Localization - multiple languages
		//currencies - multiple currencies

	}

}
