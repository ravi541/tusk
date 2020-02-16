package Test;

import java.sql.*;

public class DisplayProductDetails {
	public static void display(int pcode) throws Exception
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
	    Statement st=con.createStatement();
	    
	     ResultSet rs=st.executeQuery("Select * from ProductTable where pcode="+pcode);
	     if(rs.next())
	     {
	    	 System.out.println("-------------------------------");
	    	 System.out.println("Pcode\tPname\tPprice");
	    	 System.out.println("-------------------------------");
	    	 System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
	     }
	     else
	     {
	    	 System.out.println("No record found with "+pcode);
	     }
	     con.close();
	}
}