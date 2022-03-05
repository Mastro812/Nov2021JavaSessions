package Java_session;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Try to print following pattern on the console:
		// n = 4;
		// n = 3;
		// n = 2;
		// n = 1;
		// n = 0;

//		int n[] = new int[5];
//		n[0] = 4;
//		n[1] = 3;
//		n[2] = 2;
//		n[3] = 1;
//		n[4] = 0;
//
//		for (int x = 0; x <= 4; x++) {
//			System.out.println(n[x]);
//		}
		
//		// 2. Write a program to create a static Array, having following cricket data:
//		                        --name, age, team name, DOB, gender, Strike Rate
//		                        --Try to create multiple Object Arrays for different players 
//		                        --Try to print all the values of each player on the console*/
		
//		Object cri[] = new Object[6];
//		cri[0] = "Parag";
//		cri[1] = 25;
//		cri[2] = "Atlantis";
//		cri[3] = 1995;
//		cri[4] = 'M';
//		cri[5] = 35.33;
//		  
//		System.out.println("Name:" + cri[0]);
//		System.out.println("age:" + cri[1]);
//		System.out.println("team name :" + cri[2]);
//		System.out.println("dob :" + cri[3]);
//		System.out.println("gender :" + cri[4]);
//		System.out.println("Strike rate :" + cri[5]);
		
        //3) Define a program to find out whether a given number is even or odd		
		int a = 59;
		
		if (a%2==0) {
			System.out.println("Given number is even");
		  }	
	    else {
			System.out.println("Given number is Odd"); }
		
		// 4) A person is eligible to vote if his/her age is greater than equal to 18. Define a method to find out if he/she is eligible to vote.
	        int x  = 15;
	        if(x>=18) {
	        	System.out.println("Eligible for Vote");
	        }
	        else {
	        	System.out.println("Not eligible for vote");
	        }
	     // 5)
}

}
