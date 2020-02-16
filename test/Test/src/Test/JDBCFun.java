package Test;
import static Test.DbConnDet.*;
import java.sql.*;
import java.util.*;

class fun
{
	public void executefun()
	{
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pwd);
			CallableStatement cs=con.prepareCall("{call selemp(?,?,?) }");
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Emp num:");
			int i=Integer.parseInt(s.nextLine());
		    cs.setInt(1, i);
		    cs.registerOutParameter(2, Types.VARCHAR);
		    cs.registerOutParameter(3, Types.DOUBLE);
		    cs.execute();
		    System.out.println("Emp name is: "+cs.getString(2));
		    System.out.println("Emp sal is: "+cs.getDouble(3));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
		
	}
}

public class JDBCFun {

	public static void main(String[] args)
	{
		fun f=new fun();
		f.executefun();

	}

}
