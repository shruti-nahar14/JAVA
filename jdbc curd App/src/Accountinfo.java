import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Accountinfo {
	public int createacc(Account a)
	{
		int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into bankdb values(?,?,?)");
			ps.setInt(1, a.getAccno());
			ps.setString(2, a.getCustname());
			ps.setInt(3, a.getAccbal());
			i=ps.executeUpdate();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return i;
}
  public  int deleteacc(int accno)
  {
	  int i=0;
		Connection con=dbconnection.getconnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from bankdb where accno=?");
			ps.setInt(1,accno);
			i=ps.executeUpdate();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return i;
	}
 
}
