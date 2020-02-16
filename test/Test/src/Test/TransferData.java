package Test;

import java.sql.*;
import java.sql.DriverManager;


import static Test.DbConnDet.*;

public class TransferData {

	public static void main(String[] args) throws Exception
	
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pwd);
			Statement st=con.createStatement();
			String qry2="insert into emp1(empno,ename,sal) select empno,ename,sal from emp";
			int i=st.executeUpdate(qry2);
			if (i>0)
			{
				System.out.println(i+" rows inserted");
				
			}
			else
			{
				System.out.println("No records found");
			}
			
		}
		
	  
	
	
	
}
