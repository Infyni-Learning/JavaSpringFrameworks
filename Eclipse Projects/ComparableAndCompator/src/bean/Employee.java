package bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;

@Override
public int compareTo(Employee arg0) {
	// TODO Auto-generated method stub
	         // both value equal return 0
			//first value > second value return +ve 
			//second value > first value return -ve 
	//return this.id-arg0.id;					//0, +ve, -ve //Sort by Id Asc 
	//return arg0.id-this.id;					//Sort by Id Desc 
	//return this.name.compareTo(arg0.name);		//string compareTo method check ASCI Code of both string 
//	return arg0.name.compareTo(this.name);
	//return (int)(this.salary-arg0.salary);			//salary asc 
	return (int)(arg0.salary-this.salary)	;		//salary desc
}
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
