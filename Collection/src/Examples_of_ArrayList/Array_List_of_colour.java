package Examples_of_ArrayList;

import java.util.ArrayList;

public class Array_List_of_colour {
   


public static void main (String[]args) {	
	 
	ArrayList al =new ArrayList();
	 
	   al.add(120); 
	   al.add(260);
	    al.add(150);
	    al.add(187);
	     al.add(970);
	System.out.println(al);
	ArrayList days =new ArrayList(); 
	days.add ("Sunday");
	days.add("Monday");
	 days.add("Friday");
	al.addAll(4,days);
	System.out.println(al);
	
	
	System.out.println(al.containsAll(days));
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
 	  
	System.out.println(al.size());
	
	System.out.println("==========");

	System.out.println(al.get(5));
	
	  al.clear();
	
	System.out.println(al);
	
	
	
	
}

}









