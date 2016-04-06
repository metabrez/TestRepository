package cs.mum.edu.domain;
import javax.persistence.*;

@Entity
public class Employee {
	
	@Id 
	private int employeeNumber;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="deptId")
	private Department department;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
