package com.jarp.designpatterns.structural.bridge;

public class PersistanceImp implements Persistance {

	PersistanceImplementator imp;
	
	public PersistanceImp(PersistanceImplementator implementator)
	{
		this.imp=implementator;
	}
	
	@Override
	public String persist(Object object) {
		return Long.toString(imp.SaveObject(object));
	}

	@Override
	public Object findById(String objectId) {
		return imp.getObject(Long.parseLong(objectId));
		
	}

	@Override
	public void deleteById(String objectId) {
		imp.DeleteObject(Long.parseLong(objectId));

	}

}
