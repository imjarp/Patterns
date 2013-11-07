/**
 * 
 */
package com.jarp.designpatterns.structural.bridge;

/**
 * @author JARP
 *
 */
public class DatabasePersistanceImplementator implements
		PersistanceImplementator {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#SaveObject(java.lang.Object)
	 */
	@Override
	public long SaveObject(Object object) {
		
		
		System.out.println("Open DB & Saving");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#DeleteObject(long)
	 */
	@Override
	public void DeleteObject(long ObjectId) {
		
		System.out.println("Open DB & Delete Object");

	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#getObject(long)
	 */
	@Override
	public Object getObject(long ObjectId) {
		
		System.out.println("Open DB & Finding Object");
		return null;
	}

}
