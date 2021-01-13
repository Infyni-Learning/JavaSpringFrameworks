package com;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("File loaded successfully...");
		SessionFactory sf = con.buildSessionFactory();		// Connection con
		Session session = sf.openSession();						//Statement , PreparedStatement 
		Transaction tran = session.getTransaction();
		//Insert Query 
		/*
		Employee emp = new Employee();
		emp.setId(14);
		emp.setEmpName("RAvi");
		emp.setSalary(22000);
		
		
		tran.begin();
			session.save(emp);
		tran.commit();
		System.out.println("Record stored successfully...");
		*/
		//Delete Query 
		/*Employee emp = session.get(Employee.class, 1);
		if(emp!=null) {
			//System.out.println("Record is present");
			tran.begin();
					session.delete(emp);
			tran.commit();
			System.out.println("Record deleted successfully");
		}else {
			System.out.println("Record not present");
		}*/
		//Update Query 
			/*	Employee emp = session.get(Employee.class, 2);
				if(emp!=null) {
					//System.out.println("Record is present");
					tran.begin();
							emp.setSalary(emp.getSalary()+2000);
							session.update(emp);
					tran.commit();
					System.out.println("Record update successfully");
				}else {
					System.out.println("Record not present");
				}*/
		//Retreive only one records 
		/*Employee emp = session.get(Employee.class, 3);
		if(emp!=null) {
			System.out.println("Id is "+emp.getId());
			System.out.println("Name is "+emp.getEmpName());
			System.out.println("salary is "+emp.getSalary());
		}else {
			System.out.println("Record is not present");
		}*/
		//Retrieve more than one records like ResultSet 
		//Query<Employee> qry = session.createQuery("select e from Employee e");
		Query<Employee> qry = session.createQuery("select e from Employee e where e.salary > 15000");
		List<Employee>	listOfRec	 = qry.list();
		System.out.println("Number of records are "+listOfRec.size());
		ListIterator<Employee> listIter = listOfRec.listIterator();
		while(listIter.hasNext()) {
			Employee emp  = listIter.next();
			System.out.println(emp);
		}
	}

}
