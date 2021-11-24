package objectclass;

public class executing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object obj=new Object();
        System.out.println(obj.getClass());
        executing ex=new executing();
        System.out.println(ex.getClass());
        System.out.println(ex.equals(obj));
        System.out.println("Hashcode: "+ex.hashCode());
        System.out.println("Hashcode of Object: "+obj.hashCode());
        
	}

}
