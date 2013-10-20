/**
 * 
 */
package com.jarp.designpatterns.factorymethod.DataProvided;

/**
 * @author JARP
 *
 */
public class SoccerBall implements SportBall {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.factorymethod.SportBall#getDimensions()
	 */
	
	String Soccerball = "SoccerBall";
	@Override
	public String getDimensions() {
		// TODO Auto-generated method stub
		return this.Soccerball;
	}

}
