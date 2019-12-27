package com.bridgelabz.designpatternz.creational.singleton;

	
	public class EagerInitializedSingleton
	{
		
	    //private static variable.
	    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton()
	    {
	    	
	    }
	    
	    //public method to give acess
	    public static EagerInitializedSingleton getInstance()
	    {
	        
	        System.out.println("EagerInitializedSingleton acheived.");
	        
	        return instance;
	        
	    }
	    
	    
	}


