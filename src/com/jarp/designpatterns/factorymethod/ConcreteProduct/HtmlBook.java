/**
 * 
 */
package com.jarp.designpatterns.factorymethod.ConcreteProduct;

/**
 * @author JARP
 *
 */
public class HtmlBook extends BookCreator {

	@Override
	public void CreatePage() {
		// TODO Auto-generated method stub
		this._pages.add(new HtmlPage());
		this._pages.add(new HtmlPage());
		this._pages.add(new HtmlPage());
		
	}
	
	

}
