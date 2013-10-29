/**
 * 
 */
package com.jarp.designpatterns.prototype;

/**
 * @author JARP
 *
 * Specify the kind of objects to create using a prototypical instance, and create new objects by copying this prototype. 
 */
public class TestPrototypePattern {
	
	
	
	
	
	public void showTest()
	{
		PrototypeFactory prototypeFactory = new PrototypeFactory(new RibsBone(), new FemurBone());
		
		AbstractFlatBone flatBone = prototypeFactory.makeFlatBone();
		
		AbstractLongBone longBone = prototypeFactory.makeLongBone();
		
		System.out.println("First type of bones flat bone " + flatBone.getFlatBoneName() + " long bone " +longBone.getLongBoneName()  );
		
		
		prototypeFactory = new PrototypeFactory(new RibsBone(), new TibiaBone());
		
		flatBone = prototypeFactory.makeFlatBone();
		
		longBone = prototypeFactory.makeLongBone();
		
		System.out.println("Second type of bones flat bone " + flatBone.getFlatBoneName() + " long bone " +longBone.getLongBoneName()  );
	}
	
	  
	
	
	

}
