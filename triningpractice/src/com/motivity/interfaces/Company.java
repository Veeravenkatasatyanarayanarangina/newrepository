package com.motivity.interfaces;

public interface Company 
{	
	void route();
	void time();
}
abstract class Cargo implements Company
{
	String flighttype;
	abstract void maxVolume();
}

abstract class Passnger implements Company
{
	String flighttype;
	abstract void maxCapasity();
	
}