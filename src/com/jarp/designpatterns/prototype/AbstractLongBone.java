/**
 * 
 */
package com.jarp.designpatterns.prototype;

/**
 * @author JARP
 *
 */
public class AbstractLongBone implements Cloneable{
	
	private String longBoneName;

	public String getLongBoneName() {
		return this.longBoneName;
	}

	public void setLongBoneName(String longBoneName) {
		this.longBoneName = longBoneName;
	}
	
	
	public Object clone()
	{
		Object object = null ;
		
		try {
			object = super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		return object;
	}
	

}
