package com.bridgelabz.designpatternz.structural.facade;

public class FacadePatternDemo 
{
	public static void main(String[] args)
	{
		ShapeMaker sp = new ShapeMaker();
		
		sp.drawRectangle();
		
		sp.drawCircle();
		
		sp.drawTriangle();
		
	}

}
