package Test;
import static Test.DbConnDet.*;

import java.sql.*;



public class Login {

	public static boolean  islogin(String username , String password) throws Exception
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, un,pwd);
		PreparedStatement pst=con.prepareStatement("Select * from Regusers where username=? and password=?");
		pst.setString(1, username);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
	
		return rs.next();
		
		
	}
}
