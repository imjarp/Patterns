/**
 * 
 */
package com.jarp.designpatterns.factorymethod.DataProvided;

/**
 * @author JARP
 *
 */
public class Football implements SportBall {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.factorymethod.SportBall#getDimensions()
	 */
	
	String football = "Football";
	@Override
	public String getDimensions() {
		// TODO Auto-generated method stub
		return football;
	}

}
