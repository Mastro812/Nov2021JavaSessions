package FinalizeMethod;

public class Company {
	
	String cName;
	
	
	@Override
	public void finalize() {
		System.out.println("inside finalize method...Company");
	}
	
	//Practical use cases:
	//DB Connection--Database connection--connected
	//1.Make DB connection
	//2.Hit sql query --Exeception
	//3.get result from DB--Exeception
	
	//finally {
	//      close the DB connection
	//}
	
	//finalize ():
	//launch a browser
	//fill the form on login page
	//driver = null;
	//finalize() {
	    //clean up activity
	    //reinitialize the driver
	    //driver.quit
	    //shut down the selenium server
	//}
	

}
