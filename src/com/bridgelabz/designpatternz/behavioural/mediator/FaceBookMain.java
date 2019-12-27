package com.bridgelabz.designpatternz.behavioural.mediator;

public class FaceBookMain
{
	public static void main(String[] args)
	{
		FacebookGroupMediator mediator = new ImplementedFacebbokGroupMediator();
		
		
		//creating the users.
		User u1 = new UserImplemented("supzz",mediator);
		User u2 = new UserImplemented("ram",mediator);
		User u3 = new UserImplemented("geeta",mediator);
		User u4 = new UserImplemented("punit",mediator);
		User u5 = new UserImplemented("hari",mediator);
		
		
		//registering the users
		mediator.registerUser(u1);
		mediator.registerUser(u2);
		mediator.registerUser(u3);
		mediator.registerUser(u4);
		mediator.registerUser(u5);
		
		
		u3.send("ramj2ee.blogspot.com - this blog is very good blog ");
	    
	    System.out.println("##############################################################################");
	    
	    u5.send("what is Design Patterns? Please explain ");
	}

}
