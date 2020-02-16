package Test;

import java.util.Scanner;
import Test.Login;

public class UserAuth {

	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=s.nextLine();
		System.out.println("Enter the password:");
		String password=s.nextLine();
		boolean status=Login.islogin(username, password);
		if(status)
		{
			System.out.println("Valid credentials");
			
		}
		else
		{
			System.out.println("Invalid username and password-Login denied");
		}

	}

}
