package com.bridgelabz.designpatternz.behavioural.visitor;

public class Child implements Visitable
{
	private  String name;
	private String healthStatus;
	
	
	//constructor
	public Child(String name)
	{
		
		this.name= name;
	}
	
	
	// getters of name feild.
	
	public String getName()
	{
		return name;
	}

	//getter setters of health status
	public String getHealthStatus() {
		return healthStatus;
	}


	public void setHealthStatus(String healthStatus) 
	{
		this.healthStatus = healthStatus;
	}
	
	//overriden method of interface visitable

	public void accept(Visitor visitor) 
	{
		visitor.visit(this);
		
		
	}

}
