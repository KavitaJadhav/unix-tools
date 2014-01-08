
package kavitama.unixtools;
import java.io.*;
public class WC{

    String[] contentArray;
    String newContent = "";

	public int getNoOfLines(String content) {
	 	return content.split("\n").length;
	}
    public int getNoOfWords(String content) {
		contentArray = content.split("\n");
		for(int i =0 ;i<contentArray.length ; i++)
			newContent = newContent + contentArray[i]+" ";
		return newContent.split(" ").length;
	}
    public int getNoOfCharacters(String content) {
	 	return content.split("").length;
	}

    public String readFile(String file){
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return text;
    }
	public static void main(String args[]){
		WC wc = new WC();
        String content = wc.readFile(args[0]);
		System.out.println("lines "+wc.getNoOfLines(content));
		System.out.println("words "+wc.getNoOfWords(content));
		System.out.println("characters "+wc.getNoOfCharacters(content));

	}
}
