package Test;
import java.sql.*;
import java.util.Scanner;
 
public class hike 
{   

   public static void main(String[] args)
    {
	   try
	   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle09");
     Statement st=con.createStatement();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the emp no:");
     
    	 int empno=Integer.parseInt(s.nextLine());	 
     
    
     
    
     String qry="update emp set sal=sal+sal*0.02 where empno="+empno;
     int i=st.executeUpdate(qry);
     
     if(i>0)
     {
    
    	 System.out.println(i+"records updated") ;
     }
     else
     {
    	 System.out.println("No record found");
     }
     con.close();
     s.close();
	   }
	   catch(NumberFormatException c)
	     {
	    	 System.out.println("Print a valid num");
	     }
	   catch(Exception e)
	     {
	    	 System.out.println("Exp");
	     }
     
     
    }
}


