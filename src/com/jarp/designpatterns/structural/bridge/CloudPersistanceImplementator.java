/**
 * 
 */
package com.jarp.designpatterns.structural.bridge;

/**
 * @author JARP
 *
 */
public class CloudPersistanceImplementator implements PersistanceImplementator {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#SaveObject(java.lang.Object)
	 */
	@Override
	public long SaveObject(Object object) {
		// TODO Auto-generated method stub
		System.out.println("Saving object in the cloud");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#DeleteObject(long)
	 */
	@Override
	public void DeleteObject(long ObjectId) {
		// TODO Auto-generated method stub
		
		System.out.println("Deleting object in the cloud");

	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.bridge.PersistanceImplementator#getObject(long)
	 */
	@Override
	public Object getObject(long ObjectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
