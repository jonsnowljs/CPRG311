package implement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import utilities.*;

public class XMLParser {

	// Constants
	private static final char OPEN_TAG = '<';
	private static final char CLOSE_TAG = '>';
	private static final char END_TAG = '/';
	private static final String XML_OPEN = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";

	// Attributes
	private MyQueue<XMLTag> queue;
	private MyQueue<XMLTag> errorQueue;
	private MyQueue<XMLTag> extrasQueue;
	private MyStack<XMLTag> stack;
	private MyArrayList<String> xmlLines;
	private String fileName;

	// Constructors
	/**
	 * Constructor
	 * 
	 * @param fileName
	 *                 The xml file to parse in.
	 */
	public XMLParser(String fileName) {
		this.fileName = fileName;
		this.stack = new MyStack<>();
		this.queue = new MyQueue<>();
		this.errorQueue = new MyQueue<>();
		this.extrasQueue = new MyQueue<>();
		errorQueue.enqueue(new XMLTag("startOfError",-1, false));
		this.inputXML();
		this.parseXML();
		this.errorCheck(this.parse());

	}

	/**
	 * Method to read in the XML file to a MyArrayList of String objects, one
	 * String per line of XML.
	 */
	private void inputXML() {

		try {
			File file = new File(this.fileName);
			FileReader fileReader = new FileReader(file);
			Scanner scanner = new Scanner(fileReader);
			xmlLines = new MyArrayList<>();

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				line = line.substring(line.indexOf(OPEN_TAG));
				this.xmlLines.add(line);
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	/**
	 * Method to parse lines of XML from MyArrayList to a queue of XMLTag
	 * Objects. Some error checking occurs here (unnecessary close tags)
	 */
	private void parseXML() {
		for (int i = 0; i < this.xmlLines.size(); i++) {
			String line = this.xmlLines.get(i);

			if (line.contains(XML_OPEN)) {
				continue;
			}

			// Convert string to XMLtag
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);

				if (c == OPEN_TAG) {
					String tag = "";
					int k = j + 1;
					boolean ifEndTag = false;
					boolean ifSpacefound = false;
					
					while (line.charAt(k) != CLOSE_TAG) {
						// check if meet space in tags if found any skip until end tag
						if (line.charAt(k) == ' ') {
							ifSpacefound = true;
						} 
						// Skip endtag and make this XMLtag be a close tag
						if (line.charAt(k) == END_TAG) {

							ifEndTag = true;
							k++;
							continue;
						}

						if(!ifSpacefound) {
							tag += line.charAt(k);	
						}
						k++;
					}
					
					// ignore self closing tag
					if (line.charAt(k-1) != END_TAG ) {
						XMLTag xmlTag = new XMLTag(tag,i + 1, ifEndTag);
						this.queue.enqueue(xmlTag);				
					}
					
				}
				
			}
		}
	}

	private boolean parse() {

		XMLTag currXML;
		boolean closeTag;
		Iterator<XMLTag> queueIterator = queue.iterator();
		
		
		while (queueIterator.hasNext()) {
			currXML = (XMLTag) queueIterator.next();
			closeTag = currXML.isCloseTag();
			// if Start Tag
			if (!closeTag) {
				stack.push(currXML);
			}
			
			// if End tag
			if (closeTag) {
				if (currXML.compareTagName(stack.peek())) {
					stack.pop();
				} else if (currXML == errorQueue.peek()) {
					queue.dequeue();
				} else if (stack.isEmpty()) {
					queue.enqueue(currXML);
				} else {
					Iterator<XMLTag> stackInIterator = stack.iterator();
					Boolean ifMatch = false;
					// check if have match tag name in stack
					int counter = 0;
					while (stackInIterator.hasNext()) {
						XMLTag tempXmlTag = stackInIterator.next();
						if (currXML.compareTagName(tempXmlTag)) {
							ifMatch = true;
							counter++;
						}
					}
					if (ifMatch) {
						for (int i = 0; i <= counter; i++) {
							System.out.println("An error occurred in line" + currXML.getLine() + ". Tagname is:" + currXML.getTagName() );
							errorQueue.enqueue(stack.pop());							
						}
					} else {
						extrasQueue.enqueue(currXML);
					}


				}
			}

		}
		

		if (errorQueue.size() ==1) {

			System.out.println("No error detected in this file");
			return true;
		}
		return false;
	}

	private void errorCheck(boolean process) {
		if (process) {
			if (!stack.isEmpty()) {
				while (!stack.isEmpty()) {
					errorQueue.enqueue(stack.pop());
				}
			}
			if ((queue.isEmpty() && !extrasQueue.isEmpty()) || (!queue.isEmpty() && extrasQueue.isEmpty())) {
				if (queue.isEmpty()) {
					while (!queue.isEmpty()) {
						System.out.println("Errors occurred in" + queue.dequeue());
						System.out.println("Errors occurred in" + extrasQueue.dequeue());
					}
				} else {
					while (!extrasQueue.isEmpty()) {
						System.out.println("Errors occurred in" + queue.dequeue());
						System.out.println("Errors occurred in" + extrasQueue.dequeue());
					}

				}
				if (!queue.isEmpty() && !extrasQueue.isEmpty()) {
					if (queue.equals(extrasQueue)) {
						while (!queue.isEmpty()) {
							queue.dequeue();
						}
						while (!extrasQueue.isEmpty()) {
							extrasQueue.dequeue();
						}
					} else {
						while (!errorQueue.isEmpty()) {
							errorQueue.dequeue();
						}
						System.out.println("An error occurred. Queue and Extras Queue are not equal.");
					}
				}

			}
			/// ----some more methods ------
		}
	}
}
