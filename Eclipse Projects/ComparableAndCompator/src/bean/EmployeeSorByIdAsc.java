package bean;

import java.util.Comparator;

public class EmployeeSorByIdAsc implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return arg0.getId()-arg1.getId();
	}
}
