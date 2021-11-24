
public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("---------------STRING BUFFER----------------");
 	   StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.append(45.78);
        System.out.println(sb);
        sb.insert(12,"Welcome");
        System.out.println(sb);
        char ch=sb.charAt(7);
        System.out.println(ch);
        sb.delete(21,26);
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        int cap=sb.capacity();
        System.out.println("Capacity is "+cap);
        java.lang.String data= "Hi, All this is a demo on the String Buffer "+"String buffer class having many method to work ";
        sb.append(data);
        System.out.println(sb);
        int cp=sb.codePointAt(23);
        System.out.println(cp); 
  
	}

}
