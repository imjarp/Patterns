/**
 * 
 */
package com.jarp.designpatterns.structural.bridge;

/**
 * @author JARP
 * Implementator Interface
 */
public interface PersistanceImplementator {
	
	public long SaveObject(Object object);
	
	public void DeleteObject(long ObjectId);
	
	public Object getObject (long ObjectId);
	
	

}
