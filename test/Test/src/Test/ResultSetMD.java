package Test;

import java.util.Scanner;
import java.sql.*;


public class ResultSetMD 
{

	public static void main(String[] args) throws Exception
	{
		   
			     Class.forName("oracle.jdbc.driver.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
			     Statement st=con.createStatement();
			     Scanner s=new Scanner(System.in);
			     System.out.println("Enter any table name:");
			     String tname=s.nextLine();
			     ResultSet rs=st.executeQuery("Select * from "+tname);
			     ResultSetMetaData rsmd=rs.getMetaData();
			     for(int i=1;i<=rsmd.getColumnCount();i++)
			     {
			    	 System.out.print(rsmd.getColumnName(i)+"\t");
			    	 
			     }
			     System.out.println();
			     while(rs.next())
			     {
			    	 
			    	 for(int i=1;i<=rsmd.getColumnCount();i++)
			    	 {
			    		 System.out.print(rs.getString(i)+"\t");
			    	 }
			    	 System.out.println();
			     }

		   

	}
}
