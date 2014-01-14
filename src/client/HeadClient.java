package client;

import kavitama.unixtools.Head;

public class HeadClient {

    public static void main(String args[]){
        Head head = new Head();
        String content = "";
        int count = 10;
        for (int i = 0; i < args.length; i++) {
            if(args[i].endsWith(".txt")) content = head.readFile(args[i]);
            else count = Integer.parseInt(args[i]);
        }
        if(count < 0) count = count * (-1);
        System.out.println(head.getHead(content, count));
    }
}

