package com.bridgelabz.designpatternz.creational.singleton;

public class Main 
{
	
	public static void main(String[] args)
	{
		EagerInitializedSingleton.getInstance();
		
		SerializedSingleton.getInstance();
		
		BillPughSingleton.getInstance();
		
		LazyInitializedSingleton.getInstance();
		
		StaticBlockSingleton.getInstance();
		 
		ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		
		EnumSingleton.doSomething();   
		
	}
	
	
}
