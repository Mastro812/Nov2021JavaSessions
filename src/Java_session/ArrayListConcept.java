package Java_session;


import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection
		//Array List - default class
		// dynamic array
		
		// object of array list
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0
		ar.add(100);//0
		ar.add(200);//1
		ar.add("tom");//2
		ar.add('m');//3
		System.out.println(ar.size());//4
		System.out.println(ar.get(0));//100
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		
		
		//li= 0
		// hi = 3
		// len = hi + 1 = 4
		//hi = len - 1 = 4-1 = 3
		ArrayList ar1 = new ArrayList(20);//vc = 20
		ar1.add(100);
		ar1.add(100);//duplicate values are allowed here.
		ar1.add(null);
		ar1.add(null);
		System.out.println(ar1.size());
		System.out.println(ar1.get(1));
		System.out.println(ar1.get(2));
		System.out.println(ar1.get(2));
		ar1.add(4,200);
		ar1.add(3,1100);
		//ar1.add(9,1000);//IndexOutOfBoundsException
		System.out.println(ar1.get(4));
		System.out.println(ar1.get(3));
		//System.out.println(ar1.get(9));//IndexOutOfBoundsException
		
		//Deleting data from Array list
		ArrayList prod = new ArrayList();
		prod.add("A");//0
		prod.add("B");//1
		prod.add("C");//2
		prod.add("D");//3
		prod.add("E");//4
		System.out.println(prod.size());//5
		prod.remove(3);
		System.out.println(prod.size());//4
		System.out.println(prod.get(3));//E
		
		// int ArrayList
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		
		ArrayList<Double> sal = new ArrayList<Double>();
		sal.add(1200.2);
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("APi");
		empList.add("100");
		empList.add("Parag");
		empList.add("Parag");
		System.out.println(empList);
		
		System.out.println("---------");
		
		for(String e : empList) {
			System.out.println(e);
		}
		
		System.out.println("---------");
		
		// Various type of data in array like String,Interger,Double,Boolean.etc
		// We can use object ArrayList
		ArrayList<Object> empdata = new ArrayList<Object>();
		empdata.add("Tom");//0
		empdata.add('m');//1
		empdata.add(100);//2
		empdata.add(1200.2);//3
		empdata.add(true);//4
		
		//To print all values of ArrayList
		//for loop
		for(int i=0; i<empdata.size(); i++) {
		System.out.println(empdata.get(i));
		}
		
		System.out.println("-----");
		
		// for each loop
		for(Object e : empdata) {
			System.out.println(e);
			 if (e.equals('m')) {
			 System.out.println("male employee");
			 }
			 
		}
	    System.out.println(empdata);
		}
				
				
		
		
		
		
		

	}


