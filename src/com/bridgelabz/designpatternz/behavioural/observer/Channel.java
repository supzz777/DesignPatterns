package com.bridgelabz.designpatternz.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel
{
	
	 private List<Subscriber> subscriberList = new ArrayList<>(); //channel should have list of its subscribers.
	  
	 private String title;
	 
	 
	 public void subscribeChannel(Subscriber sub)
	 {
		 subscriberList.add(sub);
	 }
	 
	 public void unSubscribeChannel(Subscriber sub)
	 {
		 subscriberList.remove(sub);
	 }
	 
	 
	 public void notifySubcriber()
	 {
		 for( Subscriber sub : subscriberList )
		 {
			 sub.update();
		 }
	 }
	 
	 public void uploadNewVideo(String titile)
	 {
		 this.title = title;
		 notifySubcriber();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
