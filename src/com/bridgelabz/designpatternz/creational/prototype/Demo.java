package com.bridgelabz.designpatternz.creational.prototype;

public class Demo 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop bs = new BookShop();
		bs.setShopName("supzzshop");
		bs.loadData();
		System.out.println(bs); 
		
		
		
	/*	BookShop bs1 = new BookShop();
		bs1.setShopName("grckzshop");
		bs1.loadData();    //goes to database and fetches the data
		System.out.println(bs1);
		
		Output ---> BookShop [shopName=grckzshop, bookList=[Book [bookId=0, bookName=Book0],
                    Book [bookId=1, bookName=Book1], Book [bookId=2, bookName=Book2],
                    Book [bookId=3, bookName=Book3], Book [bookId=4, bookName=Book4],
                    Book [bookId=5, bookName=Book5], Book [bookId=6, bookName=Book6], 
                    Book [bookId=7, bookName=Book7], Book [bookId=8, bookName=Book8], 
                    Book [bookId=9, bookName=Book9]]]    */
		
		
		//---------------------------------------------------//
		
		/* fetching the data from the data base is tym consuming instead
		we can go for clonning the object i.e making the copy of bs object itself.*/
		
		
		//we have 2 types of clonning n java - shallow and deep clonning
		
	/*for clonning give the permission to the class by implementing 
	Cloneable interface which is a marker interface i.e interface without any methods. */
		
		
		BookShop bs1 =   (BookShop) bs.clone(); //it will go for shallow clonning.
		BookShop bs2 =   bs.cloneDeep(); //it will go for deep clonning.
		bs.getBookList().remove(2);  //same index of book will be removed from bs1 but not from bs2.
		bs1.setShopName("grckzshop"); 
		bs2.setShopName("fwewtet");
		
		System.out.println("After removing the index.");
		System.out.println("bs object --->"+bs);
		
		System.out.println("Shallow Clonning");
		System.out.println();
		System.out.println("bs1 object changed as bs--->"+bs1); //shallow clonning
		
		System.out.println("Deep Clonning");
		System.out.println();
		System.out.println("bs2 object not changed as bs--->"+bs2); //deep clonning
		 
		
		
		/*but the problem with the clone data is if you remove one data from your
		 * original object , your cloned objects data will also be removed , 
		 * i.e if you make changes in first object same changes will affect the second object
		 *  so so  go for deep clonning in which clonned objects will not be affected by one another.*/
		
	
		
	}

}
