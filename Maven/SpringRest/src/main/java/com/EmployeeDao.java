package com;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	//@Autowired
	//DataSource ds;
	
	@Autowired
	SessionFactory sf;
	
	public List<Employee> getAllEmployee() {
					Session sesion = sf.openSession();
					Query qry = sesion.createQuery("select e from Employee e");
					List<Employee> listOfRec = qry.list();
					return listOfRec;
	}
}
