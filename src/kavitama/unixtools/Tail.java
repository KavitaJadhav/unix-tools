package kavitama.unixtools;
/**
 * Created by kavitama on 1/9/14.
 */
public class Tail extends ReadFile{
    public void printTail(String text ,int count ){
        String[] lines = text.split("\n");
        int i = 0;
        if(lines.length > count) i = lines.length-count;
            for (; i <lines.length ; i++)
                System.out.println(lines[i]);
    }
    public static void main(String args[]){
        Tail t = new Tail();
        String content;
        int count;
        if (args.length>1){
            content = t.readFile(args[1]);
            count = Integer.parseInt(args[0]);
            if(count < 0) count = count * (-1);
        }
        else {
            content = t.readFile(args[0]);
            count = 10;
        }
        t.printTail(content, count);
    }
}
