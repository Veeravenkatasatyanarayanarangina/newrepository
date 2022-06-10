package com.onlinelibrary;

public class AudultUsers implements LibraryUsers
{
	int age;
	String bookname;
	
	
	public void registerAccount()
	{
		System.out.println("user age is "+age+" register as audultuser ");
		
	}

	@Override
	public void requestBook(String bookname)
	{
		System.out.println("audult user choose the book is ravinranath taagor geetanjali.....");
		
	}

	
	

}
