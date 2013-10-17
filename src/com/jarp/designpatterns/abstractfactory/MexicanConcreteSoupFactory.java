package com.jarp.designpatterns.abstractfactory;

public class MexicanConcreteSoupFactory extends AbstractSoupFactory {
	
	public MexicanConcreteSoupFactory()
	{
		factoryLocation = "Veracuz";
	}
	
	
	
	public ClamChowder makeClamChowder()
	{
		return new ClamVeracruzChowder();
	}
	
	class ClamVeracruzChowder extends ClamChowder
	{
		public ClamVeracruzChowder()
		{
			soupName="Sopa de almeja estilo veracruz";
			
			soupIngredients.clear();
			
			soupIngredients.add("1 ½ Kilogramo de Almejas Pequeñas");
			soupIngredients.add("2 Cebollas Grandes");
			soupIngredients.add("1 Kilogramo de Jitomate");
			soupIngredients.add("4 Dientes de Ajo");
			soupIngredients.add("1 Chile Poblano");
			soupIngredients.add("200 Gramos de Mantequilla Suave");
			
		}
	}
	
	
	public FishChowder makeFishChowder ()
	{
		return new VeracruzFishChowder();
	}
	
	class VeracruzFishChowder extends FishChowder
	{
		public VeracruzFishChowder(){
			soupName = "Veracruz Fish Chowder";
			soupIngredients.clear();
			
			soupIngredients.add("1 vara de apio");
			soupIngredients.add("1 litro de agua");
			soupIngredients.add("1 diente de ajo");
			soupIngredients.add("2 piezas de hoja de laurel");
			soupIngredients.add("aceite de oliva al gusto");
			soupIngredients.add("4 piezas de filete de pescado");
			soupIngredients.add("500 gramos de camarón mediano");
			soupIngredients.add("4 piezas de chile guajillo");
			soupIngredients.add("1/2 pieza de cebolla blanca");
			soupIngredients.add("pimienta negra molida al gusto");
		
		}
	}


}
