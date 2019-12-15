package com.bridgelabz.designpatternz.creational.factory;

public class OperatingSystemFactory
{
	public Car getInstance(String str) // this method will return the Car object
	{
		if(str.equals("Cheap") )
		{
			return new MarutiSuzuki();
		}
		else if ( str.equals("expensive") )
		{
			return new Audi();
		}
		else
		{
			return new RollsRoyce();
		}
	}

	

}
