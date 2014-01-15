package kavitama.unixtools;
import java.util.Arrays;

public class Sort extends  ReadWriteFile{
    public String joinArray(String[] content , String separator ,boolean reverse){
        String result = "";
        if(reverse) for(int i = content.length-1; i >=0 ; i--) result += content[i] + separator;
        else    for(int i = 0; i <content.length ; i++) result += content[i] + separator;
        return result.substring(0 , result.length()-1);
    }
    public String defaultSort(String data) {
        String[] lines = data.split("\n");
        Arrays.sort(lines);
        return joinArray(lines, "\n" ,false);
    }
    public String defaultReverseSort(String data) {
        String[] lines = data.split("\n");
        Arrays.sort(lines);
        return joinArray(lines ,"\n" ,true);
    }
}
