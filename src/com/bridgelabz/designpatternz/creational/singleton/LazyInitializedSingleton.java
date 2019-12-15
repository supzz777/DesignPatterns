package com.bridgelabz.designpatternz.creational.singleton;


	public class LazyInitializedSingleton 
	
	{
		//private static variable
	    private static LazyInitializedSingleton instance;
	    
	    
	    //private constructor
	    private LazyInitializedSingleton()
	    {
	    	
	    }
	    
	    
	    //it creates the object in the global acess method.
	    public static LazyInitializedSingleton getInstance()
	    {
		        if(instance == null)
		        {
		            instance = new LazyInitializedSingleton();
		        }
		        return instance;
		        
	    }
	    
	    
	    
	}


