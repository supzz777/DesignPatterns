package com.bridgelabz.designpatternz.creational.factory;

public class FactoryMain
{
	public static void main(String[] args)
	{
		Car car = new Audi(); /* new Audi() --> we are providing full implementation here itself as
		we are exposing the class name audi keyword here,
		 i.e your client knows which class you are working with., so to hide the implementation go 
		 for the factory design pattern. */
		
		
		car.specification();
		
		// go for making OperatingSystemFactory.java class to hide the implementations.
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		Car car1 = osf.getInstance("Cheap"); /* here by typing string you are not showing
		which class you are working upon with. */
		
		car1.specification();
		
	}

}
