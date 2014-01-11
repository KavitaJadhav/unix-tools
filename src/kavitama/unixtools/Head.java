package kavitama.unixtools;

public class Head extends ReadWriteFile {
    public String  printHead(String text ,int count ){
        String[] lines = text.split("\n");
        String result ="";
        for (int i = 0; i < count && i < lines.length ; i++) {
            result += lines[i]+"\n";
        }
        return result.substring(0 , result.length()-1);
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
        System.out.println(h.printHead(content, count));
    }
}
