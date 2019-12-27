package com.bridgelabz.designpatternz.behavioural.visitor;

public class ChildSpecialistDoctor implements Visitor
{
	private String name;
	
	
	//constructor
	public ChildSpecialistDoctor(String name)
	{
		
		this.name = name;
	}
	
	
	//getter of doctor name
	public String getDoctorName()
	{
		return name;
	}
	
	//ovveridden method of the interface.
	@Override
	public void visit(Visitable visitable) 
	{
		
		Child child = (Child) visitable; //child is object of classs Child
		//setting healthcheckup status
		child.setHealthStatus("good");
		System.out.println("child specialist doctor , Miss/Mr" +name+ " did the checkup of "
				+ "child named " +child.getName()+ " and found the health of him/her is good.");
		
	}
	

}
