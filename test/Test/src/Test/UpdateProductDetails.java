package Test;

import java.sql.*;


public class UpdateProductDetails {
	
	public static void update(int pcode, double pprice) throws Exception
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
	    Statement st=con.createStatement();
	    
	     int i=st.executeUpdate("update ProductTable set pprice="+pprice+" where pcode="+pcode);
	     if(i>0)
	     {
	    	 System.out.println("Updated Price for product code "+pcode);
	     }
	     con.close();
	     
	}

}
