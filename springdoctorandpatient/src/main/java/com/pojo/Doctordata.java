package com.pojo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Doctordata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String firstname;
    private String lastname;
    private String department;
    private String phoneno;
    private String gender;
    private String address;
    private String email;
    private String password;
    private int exp;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Doctordata() {
		super();
	}
	public Doctordata(int id, String firstname, String lastname, String department, String phoneno, String gender,
			String address, String email, String password, int exp) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.phoneno = phoneno;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.password = password;
		this.exp = exp;
	}
	
	
    
    
	
	

}
