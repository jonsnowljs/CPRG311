package utilities;

import java.io.Serializable;
import java.util.ArrayList;

public class Word implements Comparable<Word>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 299023280854310934L;
	private String word;
	private ArrayList<Integer> line = new ArrayList<>();
	private ArrayList<String> fileName = new ArrayList<>();
	private int occurence = 0;
	
	
	
	/**
	 * @param word
	 * @param line
	 * @param fileName
	 */
	public Word(String word, int line, String fileName) {
		super();
		this.word = word;
		this.line.add(line);
		this.fileName.add(fileName);
		occurence++;
	}
	
	public void wordCounter(int wordLine, String wordFileName) {


		if (fileName.contains(wordFileName)) {
			if (line.contains(wordLine)) {
				occurence++;
				return;
			} 
			this.line.add(wordLine);
			occurence++;
		} else {
			this.fileName.add(wordFileName);
			this.line.add(wordLine);
			occurence++;
		}



	}


	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}


	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}


	/**
	 * @return the line
	 */
	public ArrayList<Integer> getLine() {
		return line;
	}


	/**
	 * @param line the line to set
	 */
	public void setLine(ArrayList<Integer> line) {
		this.line = line;
	}



	/**
	 * @return the fileName
	 */
	public ArrayList<String> getFileName() {
		return fileName;
	}


	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(ArrayList<String> fileName) {
		this.fileName = fileName;
	}
	
	


	/**
	 * @return the occurence
	 */
	public int getOccurence() {
		return occurence;
	}

	/**
	 * @param occurence the occurence to set
	 */
	public void setOccurence(int occurence) {
		this.occurence = occurence;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	@Override
	public int compareTo(Word word) {
		// TODO Auto-generated method stub
		return this.word.compareTo(word.getWord());
	}
	
	
	
}
