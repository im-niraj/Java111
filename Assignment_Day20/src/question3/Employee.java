package question3;

public class Employee {
	private int empID;
	private String empName;
	private int Salary;
	public Employee(int empID, String empName, int salary) {
		this.empID = empID;
		this.empName = empName;
		Salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
}
