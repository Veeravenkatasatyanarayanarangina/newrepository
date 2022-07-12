package assainment4;

import java.util.Iterator;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		EmployeeDatabase db = new EmployeeDatabase();
		
		Employee abhi = new Employee(909,"abhi","abhi@gmail.com","male",7800.0f);
		Employee satya = new Employee(901,"satya","satya@gmail.com","male",45000.0f);
		db.addEmployee(abhi);
		db.addEmployee(satya);

		
		for (Employee employee : db.showdetails()) {
			System.out.println(employee.toString());
				
		}
		db.deleteEmployee(901);
		for (Employee employee : db.showdetails()) {
			System.out.println(employee.toString());
				
		}

		String payslip = db.payslip(909);
		System.out.println(payslip);
		
	}
	

}
