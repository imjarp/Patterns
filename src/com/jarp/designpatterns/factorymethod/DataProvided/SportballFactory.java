/**
 * 
 */
package com.jarp.designpatterns.factorymethod.DataProvided;

/**
 * @author JARP
 *
 */
public class SportballFactory {

	public static SportBall CreateSportBall(String sportType)
	{
		switch (sportType) {
		case "Football":
			return new Football();
			
		case "Soccer":
			return new SoccerBall();
			
		case "Baseball":
			return new Baseball();

		default:
			return null;
		}
	}
	
}
