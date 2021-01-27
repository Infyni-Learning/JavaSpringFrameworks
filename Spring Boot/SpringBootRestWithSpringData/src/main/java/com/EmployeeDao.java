package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	//@Query("update Employee emp set emp.salary = ?2 where emp.id=?1")
	//public int updateRec(int id, float salary);
}
