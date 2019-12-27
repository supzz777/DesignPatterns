package com.bridgelabz.designpatternz.behavioural.mediator;

public class UserImplemented extends User
{
	
	//constructor
	public UserImplemented(String name, FacebookGroupMediator mediator)
	{
		super(name, mediator);
		
	}

	@Override
	public void send(String msg)
	{
		System.out.println(this.name+"sending message:"+msg );
		mediator.sendMessage(msg, this);
		
	}

	@Override
	public void receive(String msg) 
	{
		System.out.println(this.name+" received message:"+msg );
		
	}
		
		
	
	
}
