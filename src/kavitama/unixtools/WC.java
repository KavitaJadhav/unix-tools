
package kavitama.unixtools;
public class WC extends ReadWriteFile {

    String[] contentArray;

	public int getNoOfLines(String content) {
	 	return content.split("\n").length;
	}
    public int getNoOfWords(String content) {
        String newContent = "";
		contentArray = content.split("\n");
		for(int i =0 ;i<contentArray.length ; i++)
			newContent = newContent + contentArray[i]+" ";
		return newContent.split(" ").length;
	}
    public int getNoOfCharacters(String content) {
	 	return content.split("").length;
	}
}
