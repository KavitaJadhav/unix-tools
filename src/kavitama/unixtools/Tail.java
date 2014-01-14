package kavitama.unixtools;

public class Tail extends ReadWriteFile {
    public String getTail(String text ,int count ){
        String[] lines = text.split("\n");
        String result = "";
        int i = 0;
        if(lines.length > count) i = lines.length-count;
        for (; i <lines.length ; i++)
            result += lines[i]+"\n";
        return result.substring(0 , result.length()-1);
    }
}
