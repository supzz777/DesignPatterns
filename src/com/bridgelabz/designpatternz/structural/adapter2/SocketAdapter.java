package com.bridgelabz.designpatternz.structural.adapter2;

public interface SocketAdapter //it can also be a abstract class.
{
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();

}
