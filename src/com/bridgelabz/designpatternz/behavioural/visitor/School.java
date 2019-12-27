package com.bridgelabz.designpatternz.behavioural.visitor;

import java.util.ArrayList;

public class School
{
	static ArrayList<Child> childList;
	static
	{
		childList = new ArrayList<Child>();
		
		Child child1 = new Child("John");
		Child child2 = new Child("pinki");
		Child child3 = new Child("sunny");
		Child child4 = new Child("ram");
		Child child5 = new Child("ron");
		
		//adding children to the list.
		childList.add(child1);
		childList.add(child2);
		childList.add(child3);
		childList.add(child4);
		childList.add(child5);
		
	}
	
	
	public static void doHealthCheckUp()
	{
		ChildSpecialistDoctor doctor = new ChildSpecialistDoctor("Smitha");
		
		for(Child child: childList)
		{
			child.accept(doctor); //visitable accepts the visitor
		}
		
	}

}
