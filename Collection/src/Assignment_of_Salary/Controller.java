package Assignment_of_Salary;

public class Controller {
    
public static void  main(String [] args) {	
	
	Employee[]arr= new Employee[5];
	
	arr [0] = new Employee("Asha",20,50000.00);
	arr [1] = new Employee ( "Dev",21,58000.00);           
	arr [2] = new Employee ("Datta",25 ,38000.00);
	arr [3] = new Employee ("Ashu" ,28,35000.00);
	arr [4] = new Employee ("chaman",31,25000.00);
	
	
	
	     for (int i =0; i<arr.length;i++) {
	
	        System.out.println(arr[i]);
	          
	        if(arr[i].getEmployeeSalary() <=21000.00) {
	  double updatedSalary = arr[i].getEmployeeSalary()+arr[i].getEmployeeSalary()*10/100;
	        }
	     }
		  System.out.println(arr);

   
}	        
	  
	        
	
	        
	     }

