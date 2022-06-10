package com.motivitylabs.training;

class University
{
	String universityname;
	String universitycode;
}
class College extends University
{
	String collegename;
	String collegecode;
	
}
class Student extends College
{
	String studentname;
	String studentrollno;
	
	public void  setStudentDetails(String sname,String rollno)
	{
		this.studentname = sname;
		this.studentrollno = rollno;
		collegecode="ABC-1234";
		collegename = "ABC-COLLEGE";
		universityname="XYZ-UNIVERSITY";
		universitycode = "XYZ-123";
	}


	public String studentDetails() {
		return "Student \n [studentname=" + studentname + ",\n studentrollno=" + studentrollno + ",\n collegename="
				+ collegename + ", \n collegecode=" + collegecode + ",\n universityname=" + universityname
				+ ",\n universitycode=" + universitycode + "]";
	}
	
}
public class MultilevelInheritenceExample
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setStudentDetails("satyanarayana", "163367102028");
		System.out.println(s1.studentDetails());
		
	}

}
