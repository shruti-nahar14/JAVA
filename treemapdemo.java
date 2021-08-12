/////////////////////////////
/*class: treemapdemo
 *Input:--
 *Output:------------------------------------TREEMAP---------------------------------------------------
          {BMW=1500000, maruti=800000, tata=100000, toyota=600000}
          {BMW=1500000, abc=2020, maruti=800000, tata=100000, toyota=600000}
          {BMW=1500000, abc=2020, maruti=800000, toyota=600000}
          {BMW=1500000, abc=2000000, maruti=800000, toyota=600000}
          true
          {}
 *Description:Implementation of tree map class using collection interface
 *Date:12-08-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String ,Integer> treemap=new TreeMap<String, Integer>();
		System.out.println("------------------------------------TREEMAP---------------------------------------------------");
		treemap.put("maruti", 800000);
		treemap.put("tata", 100000);
		treemap.put("toyota", 600000);
		treemap.put("BMW", 1500000);
		System.out.println(treemap);
		treemap.putIfAbsent("abc", 2020);
		System.out.println(treemap);
		treemap.remove("tata",100000); 
		System.out.println(treemap);
		treemap.replace("abc", 2020 ,2000000);
		System.out.println(treemap);
		System.out.println(treemap.containsKey("abc"));
		treemap.clear();
		System.out.println(treemap);

	}

}
