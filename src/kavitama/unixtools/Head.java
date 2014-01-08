package kavitama.unixtools;

/**
 * Created by kavitama on 1/7/14.
 */
public class Head extends ReadFile{
    public void printHead(String text ,int count ){
        String[] lines = text.split("\n");
        for (int i = 0; i < count && i < lines.length ; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String args[]){
        Head h = new Head();
        String content;
        int count;
        if (args.length>1){
            content = h.readFile(args[1]);
            count = Integer.parseInt(args[0]);
            if(count < 0) count = count * (-1);
        }
        else {
            content = h.readFile(args[0]);
            count = 10;
        }
        h.printHead(content, count);
    }
}
