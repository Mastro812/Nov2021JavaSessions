 package HashmapConcept;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {


		//key-value pair
		//<k,v>
		// not order based collection
		HashMap <String,String> prodMap = new HashMap <String,String>();
		      prodMap.put("name", "Macbook Pro");
		      prodMap.put("seller", "XYZ ent");
		      prodMap.put("size", "Macbook Pro 16 inches");
		      prodMap.put("code", "Mac32");
		      prodMap.put("colour", "Grey");
		      
//		      seller:XYZ ent
//		      colour:Grey
//		      code:Mac32
//		      size:Macbook Pro 16 inches
//		      name:Macbook Pro
//		      
		System.out.println(prodMap.get("name"));
		System.out.println(prodMap.get("seller"));
		System.out.println(prodMap.get("size"));
		
		prodMap.forEach((k,v) -> System.out.println(k +":"+v));
		
		HashMap <Integer,String> stMap = new HashMap <Integer,String>();
		      stMap.put(1, "Anil");
		      stMap.put(2, "Ravi");
		      stMap.put(3, "Puja");
		      stMap.put(4, "Anil");
		      
		     System.out.println(stMap.get(4));//Anil
		     System.out.println(stMap.get(8));//null
		     
		     System.out.println(stMap.size());
		     
		     stMap.forEach((k,v) -> System.out.println(k +":"+v));//-> called lambda
		      



	}

}
