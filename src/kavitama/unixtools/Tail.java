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
    public static void main(String args[]){
        Tail t = new Tail();
        String content = "";
        int count = 10;
        for (int i = 0; i < args.length; i++) {
            if(args[i].endsWith(".txt")) content = t.readFile(args[i]);
            else count = Integer.parseInt(args[i]);
        }
        if(count < 0) count = count * (-1);
        System.out.println(t.getTail(content, count));
    }
}
