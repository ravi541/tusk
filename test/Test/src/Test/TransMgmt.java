package Test;

import static Test.DbConnDet.*;
import java.sql.*;
import java.util.Scanner;

public class TransMgmt 
{

	public static void main(String[] args) throws Exception
	{
		try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url , un , pwd);
		con.setAutoCommit(false);
		PreparedStatement pst=con.prepareStatement("Select * from emp where empno=?");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee number:");
		int empno=Integer.parseInt(s.nextLine());
		pst.setInt(1, empno);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
		}
		else
		{
			System.out.println("No record matched with the existing number");
			System.exit(0);
		}
		System.out.println("Enter the amount you want to transfer:");
		int tamount=Integer.parseInt(s.nextLine());
		if(tamount>rs.getFloat(3))
		{
			System.out.println("Sorry you don't have sufficient funds to transfer:");
			System.exit(0);
		}
		else if(tamount<=0)
		{
			System.out.println("Please enter a valid amount greater than 0");
			
		}
		else
		{
			PreparedStatement pst2=con.prepareStatement("Update emp set sal=sal-? where empno=?");
			pst2.setInt(1, tamount);
			pst2.setInt(2, empno);
			int i=pst2.executeUpdate();
			System.out.println("Enter the deposit a/c no:");
			int dac=Integer.parseInt(s.nextLine());
			PreparedStatement pst3=con.prepareStatement("Update emp set sal=sal+? where empno=?");
			pst3.setInt(1, tamount);
			pst3.setInt(2, dac);
			int j=pst3.executeUpdate();
			if((i==1) && (j==1))
			{
				System.out.println("Funds transfered succesfully");
				con.commit();
				
			}
			else
			{
				System.out.println("Funds not transfered succesfully");
				con.rollback();
				
			}
			
		}
	}
		catch(SQLException e)
		{
			System.out.println("Funds not transfered succesfully");
			
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Enter a valid number");
			TransMgmt.main(null);	
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
			
			
		}
		
		
	}


