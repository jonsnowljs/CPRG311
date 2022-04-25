package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

import implement.BSTree;
import utilities.Iterator;
import utilities.Word;

public class WordTracker {
	
		
	public static void main(String[] args)  {
		String inputFileName = null;
		String option = null;
		String outputFileName = null;
		
		if (args.length != 2 && args.length != 4) {
			System.out.println("Please follow this command: java -jar WordTracker.jar <input.txt> -pf/-pl/-po [-f <output.txt>]");
		} else {
			inputFileName = args[0];
			option = args[1];
			if (args.length == 4) {
				outputFileName = args[3];
			}
		}
		
		constructBSTree(inputFileName);
		executeCommand(option);
		
		if (args.length == 4) {
			exportReport(outputFileName);
		}

	}
	
	private static void constructBSTree(String inputFileName) {
		// TODO Auto-generated method stub
		
		try {
			BSTree<Word> wordsTree = new BSTree<Word>(); 
			File file = new File(inputFileName);
			FileReader fileReader = new FileReader(file);
			Scanner scanner = new Scanner(fileReader);
			int lineNum = 0;
			while (scanner.hasNextLine()){
				lineNum++;
				
				String fileLine = scanner.nextLine();
				String[] wordsArray=  fileLine.split( "[^\\w']+");
				if (wordsArray.length == 0) {
					continue;
				}
				for (String string : wordsArray) {
					if (string != null) {
						Word word = new Word(string.toLowerCase(), lineNum, inputFileName);
						wordsTree.add(word);
					}
				}
				
				
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/repository.ser"));
			for (Iterator< Word> iterator = wordsTree.inorderIterator(); iterator.hasNext();) {
				Word word = (Word) iterator.next();
				oos.writeObject(word);
				
			}
			oos.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void exportReport(String outputFileName) {
		// TODO Auto-generated method stub
		
	}

	private static void executeCommand(String option) {
		// TODO Auto-generated method stub
		
	}


}
