package cs.mum.edu.domain;
import javax.persistence.*;
import java.util.*;

@Entity
public class Department {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}
