package Test;

import java.sql.*;
import java.util.Scanner;


public class ProductDetails {

	public static void main(String[] args) throws Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Please select the option you wish to process:");
	System.out.println("1) Insert Product \n2) Update Product\n3) Delete Product\n4) DisplayProduct\n5) Exit ");
	int i=Integer.parseInt(s.nextLine());
	switch(i)
	{
		case 1:
			{
				System.out.println("Enter the product code:");
				int pcode=Integer.parseInt(s.nextLine());	
				System.out.println("Enter the product name:");
				String pname=s.nextLine();
				System.out.println("Enter the product price :");
				double pprice=Double.parseDouble(s.nextLine());
				InsertProductDetails.insert(pcode, pname, pprice);
				DisplayProductDetails.display(pcode);
				break;
			}
			
		case 2:
			{
			    System.out.println("Enter the product code:");
				int pcode=Integer.parseInt(s.nextLine());	
				System.out.println("Enter the product price :");
				double pprice=Double.parseDouble(s.nextLine());
				UpdateProductDetails.update(pcode , pprice);
				break;
			}
		case 3:
		{
		    System.out.println("Enter the product code:");
			int pcode=Integer.parseInt(s.nextLine());	
			DeleteProductDetials.delete(pcode);
			break;
		}
		case 4:
		{
		    System.out.println("Enter the product code:");
			int pcode=Integer.parseInt(s.nextLine());	
			DisplayProductDetails.display(pcode);
			break;
		}
			
		case 5:
		{
			System.out.println("Thank you");
			break;
		}
		default:
		{
			System.out.println("Please enter a valid option from above");
		}
	}
	
   }	
}


