package com.jarp.designpatterns.factorymethod.ConcreteProduct;


/*
*
* Define an interface for creating an object, but let subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses. 
*/

public class TestFactorymethdoConcreteProduct {
	
	public void showTest()
	{
		
		
		BookCreator [] bookCreator = new BookCreator[2];
		
		bookCreator[0] = new HtmlBook();
		
		bookCreator[1] = new WordBook();
		
		
		for(BookCreator b :  bookCreator)
		{
			System.out.println("The book type is  "  + b.getClass().getName() );
			
			for(Page p : b._pages)
			{
				
				System.out.println("The book has an   "  + p.PageType());
			}
			
			System.out.println("-----------------------------------------------" );
		}
	}

}
