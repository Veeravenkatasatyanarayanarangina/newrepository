package com.motivitylabs.training;



class Hospital
{
	String patientname;
	int patientid;
	String problem;
	
	
	public String details() {
		return "Hospital \n [patientname=" + patientname + ",\n  patientid=" + patientid + ",\n problem=" + problem + "]";
	}
	void setPatientDetais(String name,int id,String problem)
	{
		this.patientid = id;
		this.patientname = name;
		this.problem = problem;	
	}

	public void treatement()
	{
		System.out.println("no treatement  is here.......");
	}	
}
class Cordiology extends Hospital
{
	void setPatientDetais(String name,int id,String problem)
	{
		this.patientid = id;
		this.patientname = name;
		this.problem = problem;	
	}
	public String details() {
		return "Hospital \n [patientname=" + patientname + ",\n  patientid=" + patientid + ",\n problem=" + problem + "]";
	}
	public void treatement()
	{
		System.out.println("cordiology docter will take responsible to the patient and care the patient who have with problems with their hearts..");
	}
	
}
class GeneralSurgen extends Hospital
{
	void setPatientDetais(String name,int id,String problem)
	{
		this.patientid = id;
		this.patientname = name;
		this.problem = problem;	
	}
	public String details() {
		return "Hospital \n [patientname=" + patientname + ",\n  patientid=" + patientid + ",\n problem=" + problem + "]";
	}
	public void treatement()
	{
		System.out.println("this is general surgen block he will take responcible to care with od patients ");
	}
	
}

public class HirarchicalInheritenceExample 
{
	public static void main(String[] args) 
	{
		Hospital hospital = new Hospital();
		System.out.println(hospital.details());
		hospital.treatement();
		System.out.println("======================");
		hospital = new Cordiology();
		hospital.setPatientDetais("raamu",101,"heart problem");
		System.out.println(hospital.details());
		hospital.treatement();
		System.out.println("==============================");
		hospital = new GeneralSurgen();
		hospital.setPatientDetais("raaju", 102, "viral feaver");
		System.out.println(hospital.details());
		hospital.treatement();
	}

}
