package kavitama.unixtools;
import java.util.Arrays;

public class Sort {
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

    public static void main(String[] args) {
        Sort sort = new Sort();
        System.out.println(sort.defaultSort("aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb"));
        System.out.println(sort.defaultReverseSort("aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb"));
    }
}
