package client;

import kavitama.unixtools.Tail;

public class TailClient {
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
