package kavitama.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kavitama on 1/9/14.
 */
public class ReadFile {
    public String readFile(String file){
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine+ "\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        text = text.substring(0 , text.length()-1);
        return text;
    }
}
