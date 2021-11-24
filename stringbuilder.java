
public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------STRING BUILDER-----------------");
		StringBuilder sbd=new StringBuilder("Java String Builder ");
	    System.out.println(sbd);
	    sbd.append("is Mutable class ");
	    System.out.println(sbd);
	    boolean b=sbd.isEmpty();
	    System.out.println(b);
	    int n=sbd.length();
	    System.out.println(n);
	    sbd.reverse();
	    System.out.println(sbd);
	    System.out.println(sbd.reverse());
	    System.out.println(sbd.replace(25,32,"changeable "));
	    sbd.setLength(20);
	    System.out.println(sbd);
	    
	}

}
