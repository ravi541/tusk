package Test;
import static Test.DbConnDet.*;
import java.sql.*;
import java.util.*;


public class GroupFun {

	public static void main(String[] args)
	{
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pwd);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select count(*),max(sal),min(sal),avg(sal),sum(sal) from emp");
			if(rs.next())
			{
				System.out.println("Total num of employees: "+rs.getInt(1));
				System.out.println("Highers sal of emp is "+rs.getInt(2));
				System.out.println("lowersT sal of emp is "+rs.getInt(3));
				System.out.println("Average sal of emp is: "+rs.getInt(4));
				System.out.println("sum of salaries is: "+rs.getInt(5));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
