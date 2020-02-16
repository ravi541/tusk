// Java code for serialization and deserialization 

package Test;

import java.util.Arrays;
import java.util.Scanner;

class ARG
{
	static int y=01;
	
	public static void main(String[] args)
	{
		System.out.println(y);
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input");
int[] a=new int[3];
for (int i=0;i<a.length;i++)
{
	System.out.println("Enter the input:"+i);
	a[i]=s.nextInt();
	}

Scanner s1=new Scanner(System.in);
System.out.println("enter the input you want to search");
int sc=s1.nextInt();

for(int i:a)
{
	if(i==sc)
	{
		found=true;
		break;
	}
	
}
if(found)
{
	System.out.println("element is found"+sc);
	
}
else
{
	System.out.println("element is not found"+sc);
}

	}
	
	
}

