package Java_session;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	// WAF
	//name - getCompinfo
	//input param - compName(String)
	//return - name,Bangalore,1000,5.5,"Tom" -- object static array
	// create following case using for and for each loop
	public Object []  getCompInfo(String compName) {
		System.out.println("getting info for:" + compName);
		Object info [] = new Object [5];
		if (compName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = "Bangalore";
			info[2] = "1000";
			info[3] = "5.5";
			info[4] = "Tom";	
		}
		else if (compName.equals("MS")) {
			info[0] = "MS";
			info[1] = "Mumbai";
			info[2] = "2000";
			info[3] = "6.5";
			info[4] = "Bill";	
		}
		else {
			System.out.println("comp is not found....");
		}
		return info;
		
	}
	
	//name :
	//input para:
	//return : list of products
     public ArrayList<String> getProductList(String compName) {
    	 System.out.println("getting product list :" + compName);
    	 ArrayList<String> prodList = new ArrayList<String>();
    	 
    	 switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("macbook");
			prodList.add("samsung");
			prodList.add("imac");
			break;
		
		case "walmart":
			prodList.add("nike");
			prodList.add("reebok");
			prodList.add("adidas");
			break;	
			
		case "flipkart":
			prodList.add("zara");
			prodList.add("H&M");
			prodList.add("Hrx");
			break;

		default:
			System.out.println("this company is not found :" +compName);
			break;
		}
    	 return prodList;
    	 
     }
      
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company obj = new Company();
		
		ArrayList<String> amzList = obj.getProductList("amazon");
		System.out.println(amzList); // blank list like '[]'
		System.out.println("amazon product count:"+ amzList.size());
		// for & for each loop for assignment
		ArrayList<String> wmList = obj.getProductList("walmart");
		System.out.println(wmList);
		
		ArrayList<String> sdList = obj.getProductList("snapdeal");
		System.out.println(sdList);
		
		Object comp[] = obj.getCompInfo("IBM");
		System.out.println(Arrays.toString(comp));
		
		Object comp1[] = obj.getCompInfo("NAL");
		System.out.println(Arrays.toString(comp1));
		
		

	}

}
