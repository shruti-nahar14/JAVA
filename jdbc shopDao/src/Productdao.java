import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Productdao {
	Scanner sc=new Scanner(System.in);
	public int create(Product p)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into shopapp values(?,?,?,?)");
			ps.setInt(1, p.getProdid());
			ps.setString(2,p.getProdname());
			ps.setInt(3, p.getPrice());
			ps.setInt(4, p.getProdqty());
			i=ps.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int delete(int prodid)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		try {
			PreparedStatement ps=con.prepareStatement("delete from shopapp where prodid=?");
			ps.setInt(1, prodid);
			i=ps.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int update(Product p)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		try {
			PreparedStatement ps=con.prepareStatement("update shopapp set price=? where prodid=?");
			ps.setInt(1, p.getPrice());
			ps.setInt(2, p.getProdid());
			i=ps.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public List<Product> search(int prodid)
	{
		Connection con=dbconnection.getconnection();
		List<Product> lst=null;
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from shopapp where prodid=?");
			ps.setInt(1, prodid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				lst=new ArrayList<Product>();
				lst.add(p);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	public List<Product> display()
	{
		Connection con=dbconnection.getconnection();
		List<Product> lst1=new LinkedList<Product>();
		try
		{
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from shopapp ");
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				lst1.add(p);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst1;	
	}

}
