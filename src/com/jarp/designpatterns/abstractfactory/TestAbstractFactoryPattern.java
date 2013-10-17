package com.jarp.designpatterns.abstractfactory;

import java.util.Calendar;

import sun.misc.Cache;

public class TestAbstractFactoryPattern {
	
	public void showTest()
	{
		
		Soup soup;
		
		AbstractSoupFactory concreteSoup = new MexicanConcreteSoupFactory();
		
		soup = soupOfDay(concreteSoup);
		
		System.out.println("The soup of today is from  " + concreteSoup.factoryLocation + " is " + soup.getSoupName());
		
		AbstractSoupFactory bostonSoup = new BostonConcreteSoupFactory();
		
		
		concreteSoup = new BostonConcreteSoupFactory();
		
		soup = soupOfDay(concreteSoup);
		
		System.out.println("The soup of today is from  " + concreteSoup.factoryLocation + " is " + soup.getSoupName());
	}
	
	
	/**
	 * 
	 * 
	 * */
	private static Soup soupOfDay(AbstractSoupFactory concreteSoup)
	{
		
		Calendar todayCalendar = Calendar.getInstance();
		
		int dayOfTheWeek = todayCalendar.get(Calendar.DAY_OF_WEEK);
		dayOfTheWeek=Calendar.WEDNESDAY;
		
		
		switch(dayOfTheWeek)
		{
			case Calendar.MONDAY:
				return concreteSoup.makeChickenSoup();
				
			case Calendar.TUESDAY:
				return concreteSoup.makeClamChowder();
			
			case Calendar.WEDNESDAY:
				return concreteSoup.makeFishChowder();
				
			case Calendar.THURSDAY:
				return concreteSoup.makeMinnestrone();
				
			case Calendar.FRIDAY:
				return concreteSoup.makePastaFazul();
				
			case Calendar.SATURDAY:
				return concreteSoup.makeTofuSoup();
				
			case Calendar.SUNDAY:
				return concreteSoup.makeVegetableSoup();
				
		}
			return null;
		
	}

}
