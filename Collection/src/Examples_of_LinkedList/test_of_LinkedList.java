package Examples_of_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class test_of_LinkedList {
   


public static void main(String[]args) {	

 List<Integer>ll= new LinkedList<>();	
	
 ll.add (110);
 ll.add(120);	
  ll.add(130);
  ll.add(140);
   ll.add(150);
	
	
  ll.add(1000);
  ll.add(5667);
   ll.add(53547);	
	ll.add(5000);
	
	System.out.println(((LinkedList<Integer>) ll).getFirst());
	
	System.out.println(((LinkedList<Integer>)ll).getLast());
	
	
	
	
}
}