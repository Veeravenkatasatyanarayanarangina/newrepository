package com.motivitylabs.training;

public class ItServiceDesk 
{
	String issue;
	void ticketissuelist()
	{
		System.out.println("internet connectivity...");
		System.out.println("application hanging issue....");
		System.out.println("Antivirus and spam issues......");
		System.out.println("Eaze hr issue.....");
			
	}
	void ticketissue(String issue)
	{
		this.issue=issue;
		System.out.println("specified ticket issue is : "+issue);
	}
	String solvedissue()
	{
		return this.issue;
	}
	String confirmation(boolean confirm)
	{
		if(confirm == true)
		{
		System.out.println(this.issue+"  issue was solved by it department : "+confirm);
		return "yes";
		}
		else
		{
			System.out.println(this.issue+"  issue was solved by it department : "+confirm);
			return "no";
			
		}
	}

}
