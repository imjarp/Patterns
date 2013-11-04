/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 */
public class PrintPDFWork implements VirtualPrinter {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.adapter.VirtualPrinter#printPDF(java.lang.String, java.lang.String, byte[])
	 */
	@Override
	public void printPDF(String fileName, String extension, byte[] fileInBytes) {
		// TODO Auto-generated method stub
		System.out.println("I am printing in PDF Format filname = " + fileName + " extension " + extension);

	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.adapter.VirtualPrinter#printDocumentImaging(java.lang.String, java.lang.String, byte[])
	 */
	@Override
	public void printDocumentImaging(String fileName, String extension,
			byte[] fileInBytes) {
		// TODO Auto-generated method stub
		return;

	}

}
