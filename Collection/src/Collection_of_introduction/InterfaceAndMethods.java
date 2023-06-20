package Collection_of_introduction;

import java.util.ArrayList;
import java.util.HashSet;

public class InterfaceAndMethods {

  public static void main(String[]args) {	
    ArrayList al =new ArrayList();	
	boolean b = al.add(100);
	System.out.println(b);
	boolean b1 =al.add(100);
	System.out.println(b1);
  	
	HashSet sh =new HashSet();
	boolean bb =sh.add(100);
	System.out.println(bb);
	boolean b3 = sh.add(100);
	
	ArrayList b2 = new ArrayList();
	boolean b6 = al.add(10);
	boolean b5 = al.add(10);
	System.out.println(al);
	HashSet hs = new HashSet();
	boolean b11 =hs.add(189);
	boolean b7 = hs.add(189);
	System.out.println(hs);
	
  }
}
