
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employeedao {
	
	public int create(employee e)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			ps.setInt(1,e.getEmpno());
			ps.setString(2,e.getEmpname());
			ps.setString(3,e.getJob());
			ps.setFloat(4, e.getSal());
			ps.setFloat(5,e.getComm());
			ps.setInt(6,e.getDeptno());
			i=ps.executeUpdate();
		con.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	return i;

	}
	public int delete(int id,employee e)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from employee where empno=?");
			ps.setInt(1,id);
			i=ps.executeUpdate();
		con.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	return i;
	}
	public int update(int id,float sal,employee e)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("update  employee set empsal=? where empno=?");
			ps.setFloat(1,sal);
			ps.setInt(2,id);
			i=ps.executeUpdate();
		con.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	return i;
	}
	public List<employee> search(int id,employee e)
	{
		List<employee> lst=new ArrayList<employee>();
		int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try
		{
			ps=con.prepareStatement("select * from employee where empno=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				e=new employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getInt(6));
				//lst=new ArrayList<employee>();
				lst.add(e);
			}
		}
		catch (SQLException ex) {
			// TODO Auto-generated catch block
			
 ex.printStackTrace();
		}
		return lst;

}
	public List<employee> Display(employee e)
	{
		Connection con=dbconnection.getconnection();
		LinkedList<employee> lst1=new LinkedList<employee>();
		try
		{
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from employee ");
			while(rs.next())
			{
		e= new employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getInt(6));
        lst1.add(e);
			}
		}
		catch (SQLException ex) {
			// TODO Auto-generated catch block
		ex.printStackTrace();
		}
		return lst1;	
	}


	
}