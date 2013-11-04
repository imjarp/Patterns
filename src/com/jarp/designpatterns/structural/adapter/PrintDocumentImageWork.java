/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 */
public class PrintDocumentImageWork implements VirtualPrinter {

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.adapter.VirtualPrinter#printPDF(java.lang.String, java.lang.String, byte[])
	 */
	@Override
	public void printPDF(String fileName, String type, byte[] fileInBytes) {
		// TODO Auto-generated method stub
			return ;
	}

	/* (non-Javadoc)
	 * @see com.jarp.designpatterns.structural.adapter.VirtualPrinter#printDocumentImaging(java.lang.String, java.lang.String, byte[])
	 */
	@Override
	public void printDocumentImaging(String fileName, String type,
			byte[] fileInBytes) {
		// TODO Auto-generated method stub
		System.out.print("I am priting a document imaging file which is " + fileName + " type = " + type);
		

	}

}
