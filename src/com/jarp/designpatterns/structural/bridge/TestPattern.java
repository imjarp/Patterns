/**
 * 
 */
package com.jarp.designpatterns.structural.bridge;

/**
 * @author JARP
 *Bridge is used where we need to decouple an abstraction 
 *from its implementation so that the two can vary independently.
 *
 * El patrón de diseño bridge es usado cuando necesitamos
 * desacoplar la abstración de su implementación , de esta manera
 * los dos pueden variar de manera independiente
 * 
 */
public class TestPattern {
	
	public void Test()
	{
		PersistanceImplementator implementator = new CloudPersistanceImplementator();
		
		
		Persistance persistanceObj = new PersistanceImp(implementator);
		
		persistanceObj.persist("1");
		
		implementator = new DatabasePersistanceImplementator();
		
		persistanceObj = new PersistanceImp(implementator);
		
		persistanceObj.findById("1");
		
	
		
	}

}
