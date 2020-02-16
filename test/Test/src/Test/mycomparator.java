package Test;

import java.util.Comparator;

public class mycomparator {
	
		public int compare(Object obj1,Object obj2)
		{
		Emp e1=(Emp).obj1;
		Emp e2=(Emp).obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		
		
	}
}
