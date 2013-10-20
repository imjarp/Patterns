/**
 * 
 */
package com.jarp.designpatterns.factorymethod.ConcreteProduct;

/**
 * @author JARP
 *
 */
public class WordBook extends BookCreator{

	@Override
	public void CreatePage() {
		// TODO Auto-generated method stub
		this._pages.add(new WordPage());
		this._pages.add(new WordPage());
		
	}

}
