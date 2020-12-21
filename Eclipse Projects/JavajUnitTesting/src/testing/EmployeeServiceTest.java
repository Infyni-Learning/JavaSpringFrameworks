package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Employee;
import service.EmployeeService;

public class EmployeeServiceTest {

	static EmployeeService es;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This method call only once at starting time");
		es = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This method call only once at the end ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This method call before every test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This method call after every test method");
	}

	@Test
	public void testAddEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(14000);
		String res	 = es.addEmployee(emp);
		assertEquals("Salary must be > 15000", res);
	}

	@Test
	public void testAddMoreEmployee() {
	List<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(1, "Ravi", 14000));
	listOfEmp.add(new Employee(2, "Ramesh", 16000));
	
	int res = es.addMoreEmployee(listOfEmp);
	assertEquals(2, res);
	}

	@Test
	public void testGetEmployeeById() {
	Employee emp =es.getEmployeeById(1);
	assertNull(emp);
	}

	//@Test
	public void testGetAllEmployee() {
		
	}

}
