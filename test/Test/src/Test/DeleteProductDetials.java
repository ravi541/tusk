package Test;

import java.sql.*;

public class DeleteProductDetials {
	public static void delete(int pcode) throws Exception
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
	    Statement st=con.createStatement();
	    
	     int i=st.executeUpdate("delete from ProductTable where pcode="+pcode);
	     if(i>0)
	     {
	    	 System.out.println("deleted record with product code "+pcode);
	     }
	     else
	     {
	    	 System.out.println("No record found with the product code");
	     }
	     con.close();
	}
}
