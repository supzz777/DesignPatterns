package com.bridgelabz.designpatternz.structural.adapter1;

public class School
{

	public static void main(String[] args)
	{
		
		PilotPen pp = new PilotPen();
		AssignmentWork aw = new AssignmentWork();
		/*aw.setP(pp); error --> we cannot pass object of pilotPen here as it accepts only pen  
		in setP() method,,so adapter comes in between, create class pen adapter.*/
		
		
		//aw.writeAssignment("tired to write my assignments");

		
		//go by abstract design pattern by making penadapter
		
		Pen p = (Pen) new PenAdapter();
		AssignmentWork aw1 = new AssignmentWork();
		aw1.setP(p); // now no error.
		aw1.writeAssignment(" write my assignments through pilot pen");
	}

}
