package hashset;

import java.util.HashSet;
import java.util.Set;
public class bookinfo {
	public Set<book> create()
	{
		Set<book> hashset =new HashSet<book>();
  book b1=new book(103,"java",500);
  book b2=new book(102,"oracle",600);
  book b3=new book(101,"cpp",800);
  book b4=new book(101,"cpp",800);
  hashset.add(b1);
  hashset.add(b2);
  hashset.add(b3);
  hashset.add(b4);
  return hashset;
	}
	public void display(Set<book> hashset)
	{
		for(book b:hashset)
		{
			System.out.println(b.getBookid()+"\t"+b.getBookname()+"\t"+b.getPrice());
		}
	}
	

}
