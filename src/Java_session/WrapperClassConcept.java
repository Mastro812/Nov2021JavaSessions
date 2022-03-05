package Java_session;

public class WrapperClassConcept {

	public static void main(String[] args) {
        
		//String to int conversion
		String x = "100";
//		x = x+30;
		System.out.println(x + 20);
		
		int i = Integer.parseInt(x);//100
		System.out.println(i + 20);
		
//		String y = "100A";
//		int k = Integer.parseInt(y);
//		System.out.println(y+10);//NumberFormatException
		//Assignment remove A from 100A and use Interger.parseInt again
		
		//String to double
		String total = "120.33";
		double d = Double.parseDouble(total);
		System.out.println(d+10.33);
		
		//String to boolean
		String flag = "true";
		boolean fg = Boolean.parseBoolean(flag);
		if(fg) {
			System.out.println("run ur test");
		}
		
		//int to String
		int bal = 500;
		String b = String.valueOf(bal);
		System.out.println(b+20);
		
		String mesg = "your order id is 12345";
		//substring:
		String OrderId = mesg.substring(mesg.indexOf("is")+3);
		System.out.println(OrderId);
		//Assignment
		
		String k = mesg.substring(1,11);
		System.out.println(k.trim());
		
		

	}

}
