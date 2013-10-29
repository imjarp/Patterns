package com.jarp.designpatterns.prototype;

public class PrototypeFactory {
	
	AbstractFlatBone flatBoneProtoType;
	AbstractLongBone longBonePrototype;
	
	
	public PrototypeFactory(AbstractFlatBone flatBone, AbstractLongBone longBone)
	{
		flatBoneProtoType = flatBone;
		longBonePrototype = longBone;
		
		
	}
	
	public AbstractFlatBone makeFlatBone()
	{
		return (AbstractFlatBone) flatBoneProtoType.clone(); 
	}
	

	public AbstractLongBone makeLongBone()
	{
		return (AbstractLongBone) longBonePrototype.clone();
	}

}
