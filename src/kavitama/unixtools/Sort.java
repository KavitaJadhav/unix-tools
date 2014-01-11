package kavitama.unixtools;
import java.util.Arrays;

public class Sort {
    public String joinArray(String[] content , String separator){
        String result = "";
        for (int i = 0; i <content.length ; i++) {
            result += content[i] + separator;
        }
        return result;
    }
    public String defaultSort(String data) {
        String[] lines = data.split("\n");
        Arrays.sort(lines);
        return joinArray(lines ,"\n");
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        System.out.println(sort.defaultSort("aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb"));
    }
}
