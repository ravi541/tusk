package Test;
import java.sql.*;
import java.util.Scanner;
 
public class Test 
{   

   public static void main(String[] args) throws Exception
    {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
	    Statement st=con.createStatement();
	    
		UpdateProductDetails.update(pcode, pprice);
	     int i=st.executeUpdate("update ProductTable set pprice="+pprice+" where pcode="+pcode);
	     if(i>0)
	     {
	    	 System.out.println("Updated Price for"+pcode);
	     }
	    
    
    
    }
}

