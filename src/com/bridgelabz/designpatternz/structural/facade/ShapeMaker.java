package com.bridgelabz.designpatternz.structural.facade;

public class ShapeMaker   //Facade class
{
	private Shape rectangle;
	private Shape circle;
	private Shape triangle;
	
	public ShapeMaker()
	{
		rectangle = new Rectangle();
		 circle = new Circle();
		triangle = new Triangle();	
		
	}
	
	
	public void drawRectangle()
	{
		rectangle.draw();
		
	}
	

	public void drawCircle()
	{
		circle.draw();
	}
	

	public void drawTriangle()
	{
		triangle.draw();
		
	}

}
