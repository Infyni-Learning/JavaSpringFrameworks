package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;
	
	public List<Employee> getAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query	qry = manager.createQuery("select e from Employee e");
		return qry.getResultList();
	}
	
	public 	String updateEmployee(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee e = manager.find(Employee.class,emp.getId());
		if(e!=null) {
				tran.begin();
						e.setSalary(e.getSalary()+emp.getSalary());
				tran.commit();
				return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
}
