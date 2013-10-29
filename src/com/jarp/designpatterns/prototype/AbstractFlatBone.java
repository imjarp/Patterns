/**
 * 
 */
package com.jarp.designpatterns.prototype;

/**
 * @author JARP
 * 
 */
public class AbstractFlatBone implements Cloneable {

	String flatBoneName;

	public String getFlatBoneName() {
		return this.flatBoneName;
	}

	public void setFlatBoneName(String flatBoneName) {
		this.flatBoneName = flatBoneName;
	}

	public Object clone() {
		Object object = null;
		try
		{
			object = super.clone();
		}
		catch (CloneNotSupportedException ex) {
			// TODO: handle exception
		}
		
		return object;
		
	}

}
