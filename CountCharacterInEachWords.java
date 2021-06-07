/////////////////////////////
/*class:CountCharacterInEachWords
 *Function:static void count(String str);
 * Input:--
 * Output:shruti->6
          nahar->5
          lodha->5
 *Description:Count the length of each substring
 *Date:7-June-2021
 *Author Name:Shruti Nahar
 */
package shubham;
public class CountCharacterInEachWords {
	static void count(String str)
	{
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s + "->" + s.length());
		}
		
	}
		String s1="";
	}
	
	public static void main(String[] args)
	{
		String str = "shruti nahar lodha";
		count(str);
	}
}
