package Array_Employees;

public class Employee_information {
 
	private String EmployeeName;
	private Integer EmployeeId; 
	private Double Salary;
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public Employee_information(String employeeName, Integer employeeId, Double salary) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee_information [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", Salary="
				+ Salary + "]";
	}
	
	
}
