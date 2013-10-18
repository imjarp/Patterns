package com.jarp.designpatterns.builder;

public class TestBuilderPattern {

	
	public void TestCar()
	{
		Car car = new Car.Builder(2, "color", "model", "brand", "year").build();
		
		Car carWithAC = new Car.Builder(2, "color", "model", "brand", "year")
																.withAC(true).build();
		
		Car carProp = new Car.Builder(2, "color", "model", "brand", "year")
																.withRadio(true)
																.withAC(true)
																.withToolkit(true).build();
		
	}
}
