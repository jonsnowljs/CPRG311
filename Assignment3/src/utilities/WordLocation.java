package utilities;

import java.util.ArrayList;

public class WordLocation {
	private ArrayList<Integer> line = new ArrayList<>();
	private String fileName;
	
	/**
	 * @param line
	 * @param fileName
	 */
	public WordLocation(ArrayList<Integer> line, String fileName) {
		super();
		this.line = line;
		this.fileName = fileName;
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
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
