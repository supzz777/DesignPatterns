package com.bridgelabz.designpatternz.behavioural.observer;

public class YouTubee
{
	
	public static void main(String[] args) 
	{
		Channel supzz = new Channel();
		
		//mentioning the subscribers
		Subscriber s1 = new Subscriber("pramila");
		Subscriber s2 = new Subscriber("soni");
		Subscriber s3 = new Subscriber("calin");
		Subscriber s4 = new Subscriber("aebin");
		Subscriber s5 = new Subscriber("harsh");
		
		//registering the subscribers with the channel supzz.
		supzz.subscribeChannel(s1);
		supzz.subscribeChannel(s2);
		supzz.subscribeChannel(s3);
		supzz.subscribeChannel(s4);
		supzz.subscribeChannel(s5);
		
		//subscribers knows which  channel they have subscribed.
		
		s1.subscribeChannel(supzz);
		s2.subscribeChannel(supzz);
		s3.subscribeChannel(supzz);
		s4.subscribeChannel(supzz);
		s5.subscribeChannel(supzz);
		
		//channel uploading a new video.
		supzz.uploadNewVideo("Kuch kahi unkahi bate");
		
	}
}
