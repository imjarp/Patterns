/**
 * 
 */
package com.jarp.designpatterns.builder;

/**
 * @author JARP
 *
 */
public class Car {
	
	private final int wheels;
	
	private final String color;
	
	private final String model;
	
	private final String brand;
	
	private final String year;
	
	private final boolean withAC;
	
	private final boolean withRadio;
	
	private final boolean isLuxury;
	
	private final boolean withToolkit;
	
	
	public static class Builder
	{
				
		private final int wheels;
		
		private final String color;
		
		private final String model;
		
		private final  String brand;
		
		private final  String year;
		
		private boolean withAC;
		
		private boolean withRadio;
		
		private boolean isLuxury;
		
		private boolean withToolkit;
		
		public Builder(int wheels, String color, String model, String brand, String year)
		{
			this.wheels = wheels;
			this.color  = color;
			this.model  = model;
			this.brand  = brand;
			this.year   = year;
				
		}

		
		public Builder withAC(Boolean withAC)
		{
			this.withAC=withAC;
			return this;
		}
		
		public Builder withRadio(Boolean withRadio)
		{
			this.withRadio=withRadio;
			return this;
		}
		
		public Builder isLuxury(Boolean isLuxury)
		{
			this.isLuxury=isLuxury;
			return this;
		}
		
		public Builder withToolkit(Boolean withToolkit)
		{
			this.withToolkit=withToolkit;
			return this;
		}
		
		
		public Car build()
		{
			return new Car(this);
		}
		
		
	}
	
	
	private Car(Builder builder)
	{
		this.wheels = builder.wheels;
		this.color = builder.color;
		this.model = builder.model;
		this.year = builder.year;
		this.brand = builder.brand;
		this.withAC = builder.withAC;
		this.isLuxury = builder.isLuxury;
		this.withRadio = builder.withRadio;
		this.withToolkit = builder.withToolkit;
	
	}
	

}
