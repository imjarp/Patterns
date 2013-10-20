/**
 * 
 */
package com.jarp.designpatterns.factorymethod.ConcreteProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JARP
 *
 */
public abstract class BookCreator {
	
		List<Page> _pages = new ArrayList<Page>(); 
	 
	    public List<Page> get_pages() {
			return _pages;
		}


		// Constructor calls abstract Factory method
	    public BookCreator()
	    {
	      this.CreatePage();
	    }
	 
	    
	
	public abstract void CreatePage();

}
