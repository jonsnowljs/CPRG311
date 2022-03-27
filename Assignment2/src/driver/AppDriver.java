package driver;

import java.io.FileNotFoundException;
import java.util.Scanner;

import implement.XMLParser;

public class AppDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		XMLParser xmlParser = new XMLParser("F:\\College\\SAIT\\Repository\\CPRG311\\Assignment2\\src\\driver\\sample1.xml");
		xmlParser.inputXML();
		xmlParser.parseXML();
	}

}
