package com.bridgelabz.designpatternz.behavioural.mediator;

public abstract class User 
{
	protected String name;
	protected FacebookGroupMediator mediator;
	
	
	//constructor
	public User( String name,FacebookGroupMediator mediator )
	{
		this.name = name;
		this.mediator= mediator;
	}
	
	//abstract methods.
	public abstract void send( String msg );
	
	
	public abstract void receive( String msg );
	
	
	
}
