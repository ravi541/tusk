package Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class AL {
public static void main(String[] args)
{
	Runtime r=Runtime.getRuntime();
	AL a=new AL();
	System.out.println(r.totalMemory());
	System.out.println(r.freeMemory());
	a=null;
	System.gc();
	System.out.println(r.freeMemory());
	System.out.println("end of main");
	System.out.println(r.freeMemory());
}
public void finalize()
{
	System.out.println("finalized called");
}
}
