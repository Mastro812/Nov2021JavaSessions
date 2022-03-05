package Java_session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Manish");
		empList.add("Parag");
		empList.add("Pramod");
		System.out.println(empList);
		
		//sort in order ascending order
		Collections.sort(empList);
		System.out.println(empList);
		//sort in order descending order
		Collections.sort(empList,Collections.reverseOrder());
		System.out.println(empList);
		
		System.out.println("------------");
		// print the data in reverse order
		ArrayList<String> stList = new ArrayList<String>();
		stList.add("Sachin");//0
		stList.add("Jayawant");//1
		stList.add("Dhanaji");//2
		stList.add("Digamber");//3
		
		for(int i = stList.size()-1; i>=0 ; i--) {
			System.out.println(stList.get(i));
		}
		
		System.out.println("------------");
		ArrayList<String> trList = new ArrayList<String>();
		trList.add("Jay");//0
		trList.add("Shree");//1
		trList.add("Ram");//2
		
		trList.addAll(stList);
		System.out.println(trList);//stlist & trlist added
		
		ArrayList<String> ar = new ArrayList<String>();
		 List<Integer> data = Arrays.asList(10,20,30);
		 System.out.println(data);
		 
		 List<String> names = Arrays.asList("A,AA,AAA");
		 System.out.println(names);
		 
		 //static
		 int d[] = new int[3];//new keyword
		 d[0] = 10;
		 int dd[] = {1,2,3,4,1,2,3,4};//interger literal array
		 int ddd[] = new int[]{1,2,3,4};
		 //System.out.println(ddd[4]);// index out of bound exception
		 System.out.println(ddd.length);
		 String s = "Hello"; //String literal
		 String s1 = new String("Parag");//String Object
		 
		 
		

	}

}
