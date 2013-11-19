/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 */
public class PrinterConcreteDocs implements PrinterWork{

	PrinterWorkAdapter printerAdapter;
	
	@Override
	public void print(String pages, String extension, String fileName) {


		//In built support document to physical printer
		if(extension.equals("doc"))
		{
			System.out.println("Printing documento doc with " + pages);
		}
		//Printer Adapter provides virtual printing to file
		else if(extension.equals("pdf")||extension.equals("mdi"))
		{
			printerAdapter = new PrinterWorkAdapter(extension);
			printerAdapter.print(pages, extension, fileName);
		}
		else
		{
			System.out.println("Extension not compatible");
			
		}
		
	}

}
