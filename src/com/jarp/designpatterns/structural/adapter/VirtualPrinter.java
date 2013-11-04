/**
 * 
 */
package com.jarp.designpatterns.structural.adapter;

/**
 * @author JARP
 *
 */
public interface VirtualPrinter {
	
	public void printPDF(String fileName, String extension,byte [] fileInBytes);
	
	public void printDocumentImaging(String fileName, String extension,byte [] fileInBytes);

}
