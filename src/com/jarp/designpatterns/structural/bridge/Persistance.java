package com.jarp.designpatterns.structural.bridge;


/*
 * 
 * Persistance Interface
 * Abstraction Interface
 */
public interface Persistance {
	
	public String persist(Object object);
	
	public Object findById(String objectId);
	
	public void deleteById(String objectId);

}
