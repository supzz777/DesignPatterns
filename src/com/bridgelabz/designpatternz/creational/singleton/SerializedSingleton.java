package com.bridgelabz.designpatternz.creational.singleton;

import java.io.Serializable;

 public class SerializedSingleton implements Serializable
 {
	 

	    private static final long serialVersionUID = -7604766932017737115L;

	    //private constructor
	    private SerializedSingleton()
	    {
	    	
	    }
	    
	    //nested static class
	    private static class SingletonHelper
	    {
	        private static final SerializedSingleton instance = new SerializedSingleton();
	    }
	    
	    
	    //public method
	    public static SerializedSingleton getInstance()
	    {
	    	System.out.println("SerializedSingleton acheived.");
	        return SingletonHelper.instance;
	    }
	    
	    
  }



