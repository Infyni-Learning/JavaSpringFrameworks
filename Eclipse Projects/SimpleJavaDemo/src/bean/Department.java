package bean;

import service.Employee;

public class Department {

	public void empInfo() {
		Employee emp = new Employee();
		System.out.println(emp.d);  // only public can access...
	}
}
