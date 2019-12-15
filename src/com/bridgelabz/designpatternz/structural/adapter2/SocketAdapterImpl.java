package com.bridgelabz.designpatternz.structural.adapter2;

public class SocketAdapterImpl implements SocketAdapter
{
	
	private Socket sock = new Socket();
	

	public Volt get120Volt() 
	{
		
		return sock.getVolt();
	} 

	public Volt get12Volt()
	{
		Volt v = sock.getVolt();
		return convertVolt(v, 10);
	}


	public Volt get3Volt() 
	{
	
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}
	
	//method of this  class
	private Volt convertVolt(Volt v, int i)
	{
		return new Volt(v.getVolts()/i);
	}

}
