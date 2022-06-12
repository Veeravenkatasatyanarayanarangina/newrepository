package com.automibile.twowheler;

import com.automobile.Vehicle;

public class Honda extends Vehicle
{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "honda unicon ";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return " Ap 77 z 1234";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "subbarao";
	}
	public float speed()
	{
		return 50.6f;
	}
	public void cdPlayer()
	{
		System.out.println("its supprts cd player ");
	}

}
