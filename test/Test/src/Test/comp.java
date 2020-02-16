package Test;

import java.util.Comparator;
import java.util.TreeSet;

public class comp {

	public static void main(String[] args)
	{
		
		Emp em1=new Emp("a",105);
		Emp em2=new Emp("z",108);
		Emp em3=new Emp("b",110);
		Emp em4=new Emp("Ravi",105);
		TreeSet t=new TreeSet(new mycomp());
		t.add(em1);
		t.add(em2);
		t.add(em3);
		t.add(em4);
		t.add(new Emp("RAK",115));
	
		System.out.println(t);
		
		
	}
}
/*class mycomp implements Comparator {
	
	public int compare(Object obj1,Object obj2)
	{
	Emp e1=(Emp).obj1;
	Emp e2=(Emp).obj2;
	String s1=e1.name;
	String s2=e2.name;
	return s1.compareTo(s2);
	
	
}
}*/



