/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 */
public class PrinterWorkAdapter implements PrinterWork {
	
	VirtualPrinter mVirtualPrinter;
	
	
	public PrinterWorkAdapter(String extension) {

		if(extension.equalsIgnoreCase("pdf"))
		{
			mVirtualPrinter = new PrintPDFWork();
		}
		else
		{
			mVirtualPrinter = new PrintDocumentImageWork();
		}
		
		
	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.adapter.PrinterWork#print(java.lang.String)
	 */
	@Override
	public void print(String pages, String extension,String fileName) {
		
		if(extension.equalsIgnoreCase("pdf"))
		{
			mVirtualPrinter.printPDF(fileName, extension, null);
		}
		else
		{
			mVirtualPrinter.printPDF(fileName, extension, null);
		}
		

	}

}
