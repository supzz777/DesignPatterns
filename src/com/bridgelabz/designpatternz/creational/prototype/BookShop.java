




package com.bridgelabz.designpatternz.creational.prototype;

import java.util.ArrayList;
import java.util.List;


public class BookShop implements Cloneable
{
	
	private String shopName;
	List<Book> bookList = new ArrayList<>();
	
	
	
	public String getShopName() {
		return shopName; 
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	public void loadData()
	{
		for(int i=0;i<10;i++)
		{
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book"+i);
			
			getBookList().add(b);
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}
	

	//add override clonable method to enable clonning.
	
	
	//shallow clonning.
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		//this is for shallow clonning.
		return super.clone();
	} 
	
	
	//deeep clonning.
	
	protected BookShop cloneDeep() throws CloneNotSupportedException 
	{
		//this is for deep clonning.
		BookShop shop = new BookShop();
		
		 //fetching data from bs object i.e old object and putting into the new object.
		for(Book b : getBookList() ) 
		{
			shop.getBookList().add(b);
		}
		
		return shop;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
