package com.bridgelabz.designpatternz.creational.singleton;

	
	public class BillPughSingleton
	{
		//private constructor
	    private BillPughSingleton()
	    {
	    	
	    }
	    
	    //object is created in private static class --> nested class can be made static
	    private static class SingletonHelper
	    {
	        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	    }
	    
	    
	    //calling the object from public method.
	    public static BillPughSingleton getInstance()
	    {
	        return SingletonHelper.INSTANCE;
	    }
	    
	    
	    
	    /*  When the singleton class is loaded, SingletonHelper class is not loaded 
	      into memory and only when someone calls the getInstance method,
	       this class gets loaded and creates the Singleton class instance. */
	    
	}



