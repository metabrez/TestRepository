package cs.mum.edu.control;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cs.mum.edu.domain.Department;
import cs.mum.edu.domain.Employee;

public class Application {

	static EntityManagerFactory emf ;
	static{
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		addEntities();
		printEntities();
		
		emf.close();

	}
	
	private static void addEntities(){
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();

		try {

			tx.begin();

			Department dept = new Department();
			dept.setName("CS");
			
			Employee emp = new Employee();
			emp.setEmployeeNumber(2324);
			emp.setName("Rajendra");
			emp.setDepartment(dept);
			
			//dept.setEmployees(Arrays.asList(emp));
			
			em.persist(dept);
			em.persist(emp);
			
			tx.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	private static void printEntities(){
		
	}

}
