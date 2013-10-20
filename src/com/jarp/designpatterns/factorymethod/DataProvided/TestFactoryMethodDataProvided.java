/**
 * 
 */
package com.jarp.designpatterns.factorymethod.DataProvided;

/**
 *
 * Define an interface for creating an object, but let the classes that implement 
 * the interface decide which class to instantiate. 
 * 
 * The Factory method lets a class defer instantiation to subclasses.
 * 
 * @author JARP
 *
 */
public class TestFactoryMethodDataProvided {
	
	public void showTest()
	{
		SportBall ball = new SportballFactory().CreateSportBall("Soccer");
		
		
		System.out.println("The sportball is  "  + ball.getDimensions());
		
		ball = new SportballFactory().CreateSportBall("Football");
		
		System.out.println("The sportball is  "  + ball.getDimensions());
		
		ball = new SportballFactory().CreateSportBall("Baseball");
		
		System.out.println("The sportball is  "  + ball.getDimensions());
		
		
	}

}
