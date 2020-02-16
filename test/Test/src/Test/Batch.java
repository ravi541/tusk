package Test;

import java.sql.*;
import java.util.Scanner;

import static Test.DbConnDet.*;

public class Batch 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url , un , pwd);
		PreparedStatement pst=con.prepareStatement("insert into emp45 values(?,?,?)");
		boolean w=true;
		while(w)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emp num");
		int empno=Integer.parseInt(s.nextLine());
		System.out.println("Enter the emp name");
		String ename=s.nextLine();
		System.out.println("Enter the emp sal");
		double sal=Double.parseDouble(s.nextLine());
		pst.setInt(1, empno);
		pst.setString(2, ename);
		pst.setDouble(3, sal);
		pst.addBatch();
		System.out.println("Do you want to enter another record(yes/no)");
		String ch=s.nextLine();
		if(ch.equalsIgnoreCase("no"))
			{
				w=false;
			}
		
			
		}
		
		int i[]=pst.executeBatch();
		System.out.println(i.length+" rows updated");
		pst.close();
		con.close();
		

	}

}
