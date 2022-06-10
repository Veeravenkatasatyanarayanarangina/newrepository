package com.onlinelibrary;

public class KidUsers implements LibraryUsers
{
	int age;
	String bookname;
	
	
	
	public KidUsers(int age, String bookname) {
		
		this.age = age;
		this.bookname = bookname;
	}

	public void registerAccount() 
	{
		if (this.age<12) {
		System.out.println( "You have successfully registered under a Kids "+"Account");
		}
		else
		{
			AudultUsers as = new AudultUsers();
			as.age=this.age;	
			as.registerAccount();
			as.requestBook(this.bookname);
			
		}
	
	}

	public void requestBook(String bookname) {
		System.out.println("bookname"+bookname);
		System.out.println("must return book in 10 days......");
		
		
	}

}
