/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 *This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces
 *
 * Patrón adaptor trabaja como un puente entre dos interfaces incompatibles. Este tipo de patron viene de un 
 * patrón estructural,al igual que combina la posibilidad de dos interfaces independientes.
 * 
 *  Este patrón involucra una clase la cual es responsable de unir las funcionalidades de interfaces independientes o incompatibles
 */
public class TestAdapter {
	
	
	public void showTest()
	{
		PrinterConcreteDocs printer = new PrinterConcreteDocs();
		
		printer.print("pagesDOC", "doc", "fileName.doc");
		printer.print("pagesPDF", "pdf", "fileName.pdf");
		printer.print("pagesMDI", "mdi", "fileName.pdf");
		
	}

}
