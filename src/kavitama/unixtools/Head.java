package kavitama.unixtools;

public class Head extends ReadWriteFile {
    public String  getHead(String text ,int count ){
        String[] lines = text.split("\n");
        String result ="";
        for (int i = 0; i < count && i < lines.length ; i++) {
            result += lines[i]+"\n";
        }
        return result.substring(0 , result.length()-1);
    }

}
