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
		// TODO Auto-generated method stub
		if(extension.equals("doc"))
		{
			System.out.println("Printing documento doc with " + pages);
		}
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
