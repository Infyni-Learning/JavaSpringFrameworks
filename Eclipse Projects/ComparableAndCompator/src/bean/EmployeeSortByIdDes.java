package bean;

import java.util.Comparator;

public class EmployeeSortByIdDes implements Comparator<Employee> {
@Override
public int compare(Employee arg0, Employee arg1) {
	// TODO Auto-generated method stub
	return arg1.getId()-arg0.getId();
}
}
