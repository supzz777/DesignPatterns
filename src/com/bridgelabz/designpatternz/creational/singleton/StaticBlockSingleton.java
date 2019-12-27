package com.bridgelabz.designpatternz.creational.singleton;


	public class StaticBlockSingleton
	
	{
		//private static variable
	    private static StaticBlockSingleton instance;
	    
	    
	    //private constructor
	    private StaticBlockSingleton()
	    {
	    	
	    }
	    
	    
	    //onlu diff between eager and static is of this static block
	    //static block initialization for exception handling
	    static
	    {
	        try
	        {
	            instance = new StaticBlockSingleton();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	        
	    } 
	    
	    
	    //public method to give acess
	    public static StaticBlockSingleton getInstance()
	    {
	    	System.out.println("StaticBlockSingleton acheived.");
	        return instance;
	    }
	    
	    
	    
	}


