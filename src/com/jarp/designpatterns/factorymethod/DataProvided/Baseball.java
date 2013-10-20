/**
 * 
 */
package com.jarp.designpatterns.factorymethod.DataProvided;

/**
 * @author JARP
 *
 */
public class Baseball implements SportBall {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.factorymethod.SportBall#getDimensions()
	 */
	
	String baseball = "baseball";
	@Override
	public String getDimensions() {
		// TODO Auto-generated method stub
		return this.baseball;
	}

}
