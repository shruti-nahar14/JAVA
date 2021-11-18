import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class jdbcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   PreparedStatement p;
		Connection con=null;
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System" ,"123456789");
				System.out.println("connection to DB: "+con);
			} 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch;
		System.out.println("1.create \n2.delete \n3.update \n4.search \n5.display ");
		do
		{
			System.out.println("Enter the choice ");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter the student id ");
				int id=sc.nextInt();
				System.out.println("Enter the student name ");
				String name=sc.next();
				System.out.println("Enter the student per ");
				Float per=sc.nextFloat();
				int i=0;
				try {
					 PreparedStatement  pstate = con.prepareStatement("insert into student values(?,?,?)");
					pstate.setInt(1, id);
					pstate.setString(2, name);
					pstate.setFloat(3, per);
					i = pstate.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 if(i>0)
				 {
					 System.out.println("Record save ");
				 }
			}
			else if(ch==2)
			{
				System.out.println("Enter the roll no to be deleted ");
				int id=sc.nextInt();
				int i = 0;
				try {
					PreparedStatement pstate = con.prepareStatement("delete from student where roll_no=?");
					pstate.setInt(1,id);
					i = pstate.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		            if(i>0)
		            {
		            	System.out.println("Record Deleted ");
		            }
			}
			else if(ch==3)
			{
				System.out.println("Enter rollno to update  name and perct ");
				int id=sc.nextInt();
				String name=sc.next();
				Float per=sc.nextFloat();
				int i=0;
				try {
					
					PreparedStatement pstate=con.prepareStatement("update student set per=?,name=? where roll_no=?");
					pstate.setFloat(1, per);
					pstate.setString(2, name);
					pstate.setInt(3, id);
					i = pstate.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            if(i>0)
	            {
	            	System.out.println("Record Update ");
	            }
			}
			else if(ch==4)
			{
				System.out.println("Enter the student id to be searched ");
				int id=sc.nextInt();
				PreparedStatement pstate;
				try {
					pstate = con.prepareStatement("select * from student where roll_no=?");
					pstate.setInt(1, id);
					ResultSet rs=pstate.executeQuery();
					if(rs.next())
					{
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					}
					else
					{
						System.out.println("Record not found ");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			else if(ch==5)
			{
				try {
					String str="select * from student ";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(str);
					ResultSetMetaData rsmd=rs.getMetaData();
					System.out.println("-------------------------------------------------------------------------");
					for(int i=1;i<=rsmd.getColumnCount();i++)
					{
						System.out.print(rsmd.getColumnName(i)+"\t");
					}
					System.out.println("\n-------------------------------------------------------------------------");
					while(rs.next())
					{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
           }
				System.out.println("do you want to continue ");
			}while(sc.next().equals("yes"));
		System.out.println("Thankyou");

}

	private static ResultSet excuteQuery(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static ResultSet excuteQuery() {
		// TODO Auto-generated method stub
		return null;
	}
}