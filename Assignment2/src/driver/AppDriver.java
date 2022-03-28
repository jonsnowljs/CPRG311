package driver;

import java.io.FileNotFoundException;
import java.util.Scanner;

import implement.XMLParser;

public class AppDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the XML file name: ");
		
		String xmlFile = input.nextLine();
		xmlFile = "data//" + xmlFile;	

		XMLParser xmlParser = new XMLParser(xmlFile);
	}

}