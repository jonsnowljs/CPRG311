package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
		executeCommand(wordsTree, option, outputFileName);
		
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
	
	private static void executeCommand(BSTree<Word> wordsTree, String option, String ouputFileName) {

		switch (option) {
		case "-pf": 
			try {
				PrintWriter out = new PrintWriter(ouputFileName);
				inOrderPF(wordsTree.getRoot(), out);
				out.flush();
			} catch (TreeException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "-pl": 
			try {
				PrintWriter out = new PrintWriter(ouputFileName);
				inOrderPL(wordsTree.getRoot(), out);
				out.flush();
			} catch (TreeException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "-po":
			try {
				PrintWriter out = new PrintWriter(ouputFileName);
				inOrderPO(wordsTree.getRoot(), out);
				out.flush();
			} catch (TreeException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}

	
	/**
	 * Print the node value in alphabetical order
	 * @param node
	 */
	public static void inOrderPF(BSTreeNode<Word> node, PrintWriter out) {
	    if (node == null) {
	      return;
	    } 
	    inOrderPF(node.getLeft(), out);
	    String result = "Word: " + node.getData().getWord() +" File Name: " + node.getData().getFileName();
	    System.out.println(result);
	    out.println(result);
	    inOrderPF(node.getRight(), out );
	}

	/**
	 * Print the node value in alphabetical order
	 * @param node
	 */
	public static void inOrderPL(BSTreeNode<Word> node, PrintWriter out) {
	    if (node == null) {
	      return;
	    } 
	    inOrderPL(node.getLeft(), out);
	    String result = "Word: " + node.getData().getWord() +" File Name: " + node.getData().getFileName() + " Line Number: " + node.getData().getLine();
	    System.out.println(result);
	    out.println(result);
	    inOrderPL(node.getRight(), out);
	}

	/**
	 * Print the node value in alphabetical order
	 * @param node
	 */
	public static void inOrderPO(BSTreeNode<Word> node, PrintWriter out) {
	    if (node == null) {
	      return;
	    } 
	    inOrderPO(node.getLeft(), out);
	    String result ="Word: " + node.getData().getWord() +" File Name: " + node.getData().getFileName() + " Line Number: " + node.getData().getLine() + " Occurence: " + node.getData().getOccurence();
	    System.out.println(result);
	    out.println(result);
	    inOrderPO(node.getRight(),out);
	}



}
