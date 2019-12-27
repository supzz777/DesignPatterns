package com.bridgelabz.designpatternz.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ImplementedFacebbokGroupMediator implements FacebookGroupMediator
{	
	
	public List<User> UserList;
	
	//constructor
	
	public ImplementedFacebbokGroupMediator()
	{
		UserList = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User userWritingMessage) 
	{
		for( User u : UserList )
		{	
			//message should not be send to one who is writing it.
			if(u!=userWritingMessage)
			{
				u.receive("msg");
			}
			
		}
		
	}

	@Override
	public void registerUser(User user)
	{
		UserList.add(user);
		
	}
	

}
