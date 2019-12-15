package com.bridgelabz.designpatternz.creational.singleton;

public class ThreadSafeSingleton 
{
	
		//private static variable
	   private static ThreadSafeSingleton instance;
	    
	    
	    
	    //private constructor
	    private ThreadSafeSingleton()
	    {
	    	
	    }
	    
	    
	    //instance is created in the globally accessible method 
	    
	    //only diff between the lazy and thread safe singleton is of word synchronized used inside this method.
	    public static synchronized ThreadSafeSingleton getInstance()
	    {
	        if(instance == null)
	        {
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }
	    
	
	    /*double checked locking -- In this approach, the synchronized block is used inside 
		    the if condition with an additional check to ensure that only one instance of
		    a singleton class is created. */
		    
	    //double checked locking method
	    public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
	    {
	        if(instance == null)
	        {
	            synchronized (ThreadSafeSingleton.class)
	            {
	                if(instance == null)
	                {
	                    instance = new ThreadSafeSingleton();
	                }
	            }
	        }
	        return instance;
	    }


}
