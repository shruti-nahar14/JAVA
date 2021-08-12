/////////////////////////////
/*class: Hashmapdemo
 *Input:--
 *Output:------------------------------------HASHMAP---------------------------------------------------
         {maruti=800000, toyota=600000, tata=100000, BMW=1500000}
         {maruti=800000, abc=2020, toyota=600000, tata=100000, BMW=1500000}
         {maruti=800000, abc=2020, toyota=600000, BMW=1500000}
         {maruti=800000, abc=2000000, toyota=600000, BMW=1500000}
         true
         {}
 *Description:Implementation of hash map class using collection interface
 *Date:12-08-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package map;

import java.util.HashMap;
import java.util.Map;
public class Hashmapdemo {
	public static void main(String[] args)
	{
		Map<String ,Integer> hashmap=new HashMap<String, Integer>();
		System.out.println("------------------------------------HASHMAP---------------------------------------------------");
		hashmap.put("maruti", 800000);
		hashmap.put("tata", 100000);
		hashmap.put("toyota", 600000);
		hashmap.put("BMW", 1500000);
		System.out.println(hashmap);
		hashmap.putIfAbsent("abc", 2020);
		System.out.println(hashmap);
		hashmap.remove("tata",100000); 
		System.out.println(hashmap);
		hashmap.replace("abc", 2020 ,2000000);
		System.out.println(hashmap);
		System.out.println(hashmap.containsKey("abc"));
		hashmap.clear();
		System.out.println(hashmap);
	}

}
