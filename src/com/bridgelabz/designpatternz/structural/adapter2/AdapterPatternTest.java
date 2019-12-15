package com.bridgelabz.designpatternz.structural.adapter2;

public class AdapterPatternTest
{
	public static void main(String[] args)
	{
		
		
		testObjectAdapter(); 
	}

		private static void testObjectAdapter() 
		{
			SocketAdapter sockAdapter = new SocketAdapterImpl();
			Volt v3 = getVolt(sockAdapter,3);
			Volt v12 = getVolt(sockAdapter,12);
			Volt v120 = getVolt(sockAdapter,120);
			System.out.println("v3 volts using socket Adapter="+v3.getVolts());
			System.out.println("v12 volts using socket Adapter="+v12.getVolts());
			System.out.println("v120 volts using socket Adapter="+v120.getVolts());
		}

	 
	
		private static Volt getVolt(SocketAdapter sockAdapter, int i) 
		{
			switch (i)
			{
			case 3: return sockAdapter.get3Volt();
			case 12: return sockAdapter.get12Volt();
			case 120: return sockAdapter.get120Volt();
			default: return sockAdapter.get120Volt();
			}
		}
		
	
}
