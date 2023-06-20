package Examples_of_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_Examples {

	public static void main (String[]args) {
	
	ArrayList al = new ArrayList(); 
	  
	al.add (276);
	al.add ( 975);
	
	ArrayList ArrayListsmallArraylist = new ArrayList(); 
	
	
	
al.add("Sandhya");
	al.add("Rupali");
	

	al.add(1251);
	System.out.println(al); 
 	  
	al.remove(Integer.valueOf(1251));
	
	System.out.println(al);
	 
	ArrayList rm =new ArrayList();
	   
	rm.add(30);
	rm.add(50);
	rm.add(78);
	
	al.removeAll(rm);
	
	System.out.println(al);
	
	
	}
	
}