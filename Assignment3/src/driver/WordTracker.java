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
import utilities.BSTreeNode;
import utilities.Iterator;
import utilities.TreeException;
import utilities.Word;

public class WordTracker {
	public static void main(String[] args)  {
		BSTree<Word> wordsTree = new BSTree<Word>();
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
		
		constructBSTree(wordsTree, inputFileName);
		executeCommand(wordsTree, option);
		
		if (args.length == 4) {
			exportReport(outputFileName);
		}

	}
	
	private static BSTree<Word> constructBSTree(BSTree<Word> wordsTree, String inputFileName) {
		// TODO Auto-generated method stub
		
		try {
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
					if (string != null ) {
						Word word = new Word(string.toLowerCase(), lineNum, inputFileName);
						
						try {
							BSTreeNode<Word> foundWords =  wordsTree.search(word);
							if (foundWords == null) {
								wordsTree.add(word);
							} else {
								foundWords.getData().wordCounter(lineNum, inputFileName);
							}
						} catch (Exception e) {
							
						}

						
					}
				}

			}
			
			
		
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/repository.ser"));
			for (Iterator< Word> iterator = wordsTree.inorderIterator(); iterator.hasNext();) {
				Word word = (Word) iterator.next();
				oos.writeObject(word);
				
			}
			oos.close();
			
			return wordsTree;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TreeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wordsTree;
		

	}
	
	private static void executeCommand(BSTree<Word> wordsTree, String option) {
		switch (option) {
		case "-pf": 
			try {
				inOrderPF(wordsTree.getRoot());
			} catch (TreeException e) {
				e.printStackTrace();
			}
		
		case "-pl": 
			try {
				inOrderPL(wordsTree.getRoot());
			} catch (TreeException e) {
				e.printStackTrace();
			}
		
		case "-po":
			
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}

	private static void exportReport(String outputFileName) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Print the node value in alphabetical order
	 * @param node
	 */
	public static void inOrderPF(BSTreeNode<Word> node) {
	    if (node == null) {
	      return;
	    } 
	    inOrderPF(node.getLeft());
	    System.out.println(node.getData().getWord() + " " + node.getData().getFileName());
	    inOrderPF(node.getRight());
	}

	/**
	 * Print the node value in alphabetical order
	 * @param node
	 */
	public static void inOrderPL(BSTreeNode<Word> node) {
	    if (node == null) {
	      return;
	    } 
	    inOrderPL(node.getLeft());
	    System.out.println(node.getData().getWord() + " " + node.getData().getLine());
	    inOrderPL(node.getRight());
	}




}
