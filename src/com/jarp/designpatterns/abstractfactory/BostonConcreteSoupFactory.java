/**
 * 
 */
package com.jarp.designpatterns.abstractfactory;

/**
 * @author JARP
 *
 */
public class BostonConcreteSoupFactory extends  AbstractSoupFactory{
	
	public BostonConcreteSoupFactory()
	{
		factoryLocation = "Boston";
	}
	
	public ClamChowder makeClamChowder() {
		return new BostonClawChowder();
	}
	
	public FishChowder makeFishChowder()
	{
		return new BostonFishChowder();
	}
	
	class BostonClawChowder extends ClamChowder
	{
		public BostonClawChowder()
		{
			soupName = "BostonClawChowder";
			soupIngredients.clear();
			soupIngredients.add("1 Pound Fresh Quahogs");
	        soupIngredients.add("1 cup corn");    
	        soupIngredients.add("1/2 cup heavy cream");
	        soupIngredients.add("1/4 cup butter");    
	        soupIngredients.add("1/4 cup potato chips");
			
		}
	}
	
	class BostonFishChowder extends FishChowder
	{
		
		public BostonFishChowder()
		{
			soupName ="BostonFishChowder";
			soupIngredients.clear();
			soupIngredients.add("1 Pound Fresh Scrod");
	        soupIngredients.add("1 cup corn");    
	        soupIngredients.add("1/2 cup heavy cream");
	        soupIngredients.add("1/4 cup butter");    
	        soupIngredients.add("1/4 cup potato chips");
			
			
		}
		
	}
	

}
