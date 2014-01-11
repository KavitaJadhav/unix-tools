
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
	public static void main(String args[]){
		WC wc = new WC();
        String content = wc.readFile(args[0]);
		System.out.println("lines "+wc.getNoOfLines(content));
		System.out.println("words "+wc.getNoOfWords(content));
		System.out.println("characters "+wc.getNoOfCharacters(content));
	}
}
