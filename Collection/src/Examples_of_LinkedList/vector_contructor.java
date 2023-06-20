package Examples_of_LinkedList;

import java.util.LinkedList;
import java.util.Vector;

public class vector_contructor {

      public static void main(String[]args) {	
	   
	   Vector<Integer>v =new Vector<>();
	   
	  v.add(759);
	  v.add(456);
	   v.add(190);
	   v.add(250);


	   
	   
	   System.out.println(v.size());
	   
	   System.out.println(v.capacity());
	   
	   for(int i=10;i<=100;i=i+100) {

            v.add(i);   
		   v.add(110);
		   System.out.println(v);

	
      }
	
	
      }
	
}
