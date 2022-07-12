package assainment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDatabase 
{
	List<Employee> listdb =new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e)
	{
		//here i want to store employee object in list
		boolean add =listdb.add(e);
		return add;
		
	}
	public boolean deleteEmployee(int id)
	{
		boolean delete = false;
		Iterator<Employee> it = listdb.iterator();
		while(it.hasNext())
		{
			Employee employee = it.next();
			if(employee.getEmpId()==id)
			{
				delete = true;
				it.remove();
				
			}
		}
		return delete;
	}
	
	public String payslip(int id)
	{
		String pslip="error";
		
		for(Employee e:listdb)
		{
			if(e.getEmpId()==id)
			{
				pslip = e.getEmpName()+" salary is :"+e.getSalary();
			}
		}
		return pslip;
	}
	public Employee[] showdetails()
	{
		Employee[] array =new Employee[listdb.size()];
		for(int i = 0;i<listdb.size();i++)
		{
			array[i]=listdb.get(i);
		}
		return array;
				
	}

}
