package OOP_AbstractClassses;

public abstract class Page extends WebPage implements W3C {
	//0 to 100% abstraction
	//0% - no abstract method
	//100% - only abstract method
	//partial abstraction
	//cannot create the object of abstract classes
	//but I can create constructor of abstract class and it will invoke when you create the object of the child class
	
	public Page() {
		System.out.println("Page--default constructor....");
	}
	public Page(String i) {
		System.out.println("Page--one parameter..." + i);
	}
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String un,String pwd) {
		System.out.println("page--login"+ un +":"+ pwd);
	}
	public static void logo() {
		System.out.println("page--logo");
	}
	public final void calculatePrice() {
		System.out.println("page--calculate price");
	}
	
	@Override
	public void loading() {
		System.out.println("page --loading..");
	}
	
	@Override
	public void javaScriptLoading(){
		System.out.println("LP--javaScriptLoading");
		
	}

	//above 2 methods static & final cannot be overridden

}  
