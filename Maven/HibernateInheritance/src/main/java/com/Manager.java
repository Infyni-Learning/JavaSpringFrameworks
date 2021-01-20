package com;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name = "manager_3")
//@DiscriminatorColumn(name = "type_of_emp")
//@DiscriminatorValue(value="Mgr")
public class Manager extends Employee{
private int numberOfEmp;

public int getNumberOfEmp() {
	return numberOfEmp;
}

public void setNumberOfEmp(int numberOfEmp) {
	this.numberOfEmp = numberOfEmp;
}

}
