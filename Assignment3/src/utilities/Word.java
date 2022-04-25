package utilities;

import java.io.Serializable;

public class Word implements Comparable<Word>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 299023280854310934L;
	private String word;
	private int line;
	private String fileName;
	
	/**
	 * @param word
	 * @param line
	 * @param fileName
	 */
	public Word(String word, int line, String fileName) {
		super();
		this.word = word;
		this.line = line;
		this.fileName = fileName;
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
	public int getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	@Override
	public int compareTo(Word o) {
		return this.word.compareTo(o.getWord());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
