package Array_Employees;

import java.lang.reflect.Array;

public class ArrayEmployees {

 private String Name;
 private Integer ID;
 private Double Salary;
 
 
public static void main (String[]args) {
	     
	ArrayEmployees[] Employees   = new ArrayEmployees[5];
	
         Employees[0]  = new  ArrayEmployees();
	      Employees[0] .Name= "Sandhya" ;
	      Employees[0].ID = 101;
	      Employees[0].Salary = 10000.00;
  
	      Employees[1]=new ArrayEmployees();
	      Employees[1].Name="Arnav";
	      Employees[1].ID =586;    
	      Employees[1].Salary=25000.00;
   
           Employees[2] =new ArrayEmployees();
           Employees[2].Name="dhanu";
           Employees[2].ID =544;
           Employees[2].Salary=18000.00;
           
           Employees[3] =new ArrayEmployees();
           Employees[3] .Name="gatha";
           Employees[3].ID =210;
           Employees[3].Salary =300000.00;
           
           Employees[4] =new ArrayEmployees();
           Employees[4].Name ="Lata";
           Employees[4].ID=367;
           Employees[4].Salary =21000.00;
           
           System.out.println(Employees);
             
          
           
           





}	
}
