package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("trying to launching chrome...");
		checkOSCompatible();
		checkBrowserVersion();
		enoughRAM();
		isBrowserUpgraded();
		System.out.println("chrome is launched...");
		
	}
	private void checkOSCompatible() {
		System.out.println(" checkOSCompatible...");
	}
	private void checkBrowserVersion() {
		System.out.println(" checkBrowserVersion...");
	}
	private void enoughRAM() {
		System.out.println(" enoughRAM...");
	}
	private void isBrowserUpgraded() {
		System.out.println(" isBrowserUpgraded...");
	}

}
