package com.bridgelabz.designpatternz.behavioural.observer;


//Assuming one subscriber is subscribing to only one channel
public class Subscriber 
{
	private String name;
	private Channel channel= new Channel(); //channel is a class so make a object of it.
	
	
	//constructor
	public Subscriber(String name)
	{
		
		this.name = name;
	}

	
	public void update()
	{
		System.out.println("hey "+name+" a new video is uploaded by supzz channel");
	}
	
	//subscriber should be knowing which channel it is subscribing
	public void subscribeChannel(Channel ch)
	{
		channel= ch; //moment you subscribe a new channel it will update your channel
	}
	

}
