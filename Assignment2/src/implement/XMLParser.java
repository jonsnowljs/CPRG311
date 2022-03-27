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
		this.inputXML();
		this.parseXML();
		this.parse();
		this.errorCheck();
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
	// private void parseXML() {
	// for (int i = 0; i < this.xmlLines.size(); i++) {
	// String line = this.xmlLines.get(i);

	// if (line.contains(XML_OPEN)) {
	// continue;
	// }

	// if (line.contains(String.valueOf(OPEN_TAG))) {
	// String tagName = line.substring(1, line.indexOf(CLOSE_TAG));

	// if (line.contains(END_TAG)) {
	// this.queue.enqueue(new XMLTag(tagName, true));
	// } else {
	// this.queue.enqueue(new XMLTag(tagName, false));
	// }
	// } else if (line.contains(String.valueOf(CLOSE_TAG))) {
	// String tagName = line.substring(0, line.indexOf(CLOSE_TAG));

	// if (this.queue.isEmpty()) {
	// System.out.println("Error: Unnecessary close tag.");
	// } else {
	// XMLTag tag = this.queue.dequeue();

	// if (!tag.getTagName().equals(tagName)) {
	// System.out.println("Error: Unnecessary close tag.");
	// } else {
	// this.stack.push(tag);
	// }
	// }
	// }
	// }
	// }

	private void parseXML() {
		int size = xmlLines.size();

		queue = new MyQueue<>();

		String line;

		for (int i = 0; i < size; i++) {
			line = xmlLines.get(i);
			if (!line.equals(XML_OPEN)) {
				if (line.charAt(0) == OPEN_TAG && line.charAt(line.length() - 1) == CLOSE_TAG
						&& line.charAt(line.length() - 2) != END_TAG) {
					if (line.contains(" ")) {
						queue.enqueue(new XMLTag(line.substring(1, line.indexOf(" ")), false));
					} else {
						queue.enqueue(new XMLTag(line.substring(1, line.length() - 1), false));
					}
				}
				if (line.charAt(0) == OPEN_TAG && line.charAt(line.length() - 1) == CLOSE_TAG
						&& line.charAt(1) == END_TAG) {
					if (line.contains(" ")) {
						queue.enqueue(new XMLTag(line.substring(1, line.indexOf(" ")), true));
					} else {
						queue.enqueue(new XMLTag(line.substring(1, line.length() - 1), true));
					}
				}

			}
		}
	}

	private void parse() {
		stack = new MyStack<XMLTag>();
		errorQueue = new MyQueue<XMLTag>();
		XMLTag currXML;
		boolean closeTag;
		Iterator queueIterator = queue.iterator();

		while (queueIterator.hasNext()) {
			currXML = (XMLTag) queueIterator.next();
			closeTag = currXML.isCloseTag();

			if (!closeTag) {
				stack.push(currXML);
			}
			if (closeTag) {
				if (currXML == stack.peek()) {
					stack.pop();
				} else if (currXML == errorQueue.peek()) {
					queue.dequeue();
				} else if (stack.isEmpty()) {
					queue.enqueue(currXML);
				} else {
					if (stack.contains(currXML)) {
						int index = stack.search(currXML);
						for (int i = 0; i < index; i++) {
							errorQueue.enqueue(stack.pop());
						}
						System.out.println("An error occurred.");
					} else {
						extrasQueue.enqueue(currXML);
					}

				}
			}

		}
	}

	private void errorCheck() {
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
