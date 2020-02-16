package Test;

import java.sql.*;

public class InsertProductDetails 
{

	public static void insert(int pcode,String pname , double pprice) throws Exception
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
	     PreparedStatement pst=con.prepareStatement("insert into ProductTable values(?,?,?)");
	     pst.setInt(1, pcode);
	     pst.setString(2, pname);
	     pst.setDouble(3,pprice);
	     int i=pst.executeUpdate();
	     System.out.println("Record Inserted succefully");
	     con.close();
	     
	}
}
