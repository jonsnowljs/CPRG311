package implement;



public class XMLTag {
	
	//Attributes
		private String tagName;
		private int line;
		private boolean closeTag;
		
		
		//Constructors
		public XMLTag(String tagName, boolean closeTag)
		{
			this.tagName = tagName;
			this.closeTag = closeTag;
		}
		
		public XMLTag(String tagName, int line, boolean closeTag)
		{
			this.tagName = tagName;
			this.line = line;
			this.closeTag = closeTag;
		}
		
		//Getters and Setter
		/**
		 * @return the tagName
		 */
		public String getTagName() {
			return tagName;
		}
		
		/**
		 * @param line The line number of the tag
		 */
		public void setLine(int line) {
			this.line = line;
		}
		
		/**
		 * Designates this tag as a closing tag
		 * @param closeTag the closeTag to set
		 */
		public void setCloseTag(boolean closeTag) {
			this.closeTag = closeTag;
		}

		//---some other getters or setters

		/**
		 * @param tagName the tagName to set
		 */
		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		/**
		 * @return the line
		 */
		public int getLine() {
			return line;
		}



		/**
		 * @return the closeTag
		 */
		public boolean isCloseTag() {
			return closeTag;
		}

		//Operational Methods
		
		/**
		 * Compares the tag name of this and another tag.
		 * @param that The tag to compare
		 * @return true if equal, false if not
		 */
		public boolean compareTagName(XMLTag that) {
			return this.tagName.equals(that.tagName);
		}
		
		
		
		//---may be some other methods----
		
		
		
		

}
