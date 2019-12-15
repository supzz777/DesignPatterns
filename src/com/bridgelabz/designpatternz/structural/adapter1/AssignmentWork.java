package com.bridgelabz.designpatternz.structural.adapter1;

public class AssignmentWork 
{
	
	private Pen p;
	
	
	//getter ans setters for variable p.
	
	public Pen getP() {
		return p;
	}


	public void setP(Pen p) {
		this.p = p;
	}

	
	
	
	public void writeAssignment(String str)
	{
		p.write(str);
	}

}
