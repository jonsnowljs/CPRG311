package implement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import exceptions.EmptyQueueException;
import utilities.MyArrayList;
import utilities.MyQueue;
import utilities.MyStack;

public class XMLParser {
	
	// Constants
		private static final char OPEN_TAG = '<';
		private static final char CLOSE_TAG = '>';
		private static final String END_TAG = "/";
		private static final String XML_OPEN = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		
		// Attributes
		private MyQueue<XMLTag> queue;
		private MyStack<XMLTag> stack;
		private MyArrayList<String> xmlLines;
		private String fileName;
		
		// Constructors

		/**
		 * Constructor
		 * 
		 * @param fileName
		 *            The xml file to parse in.
		 */
		public XMLParser(String fileName)
		{
			// TODO Auto-generated constructor stub
		
		}
		
		
		
		/**
		 * Method to read in the XML file to a MyArrayList of String objects, one
		 * String per line of XML.
		 */
		private void inputXML()
		{
			// TODO Auto-generated  stub
		}
		
		
		/**
		 * Method to parse lines of XML from MyArrayList to a queue of XMLTag
		 * Objects. Some error checking occurs here (unnecessary close tags)
		 */
		private void parseXML()
		{
			// TODO Auto-generated  stub
		
		}
		
		///----some more methods ------

}
