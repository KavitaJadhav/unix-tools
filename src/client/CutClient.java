package client;

import kavitama.unixtools.Cut;

public class CutClient {

    public static void main(String args[]) {
        Cut cut = new Cut();
        String content="" , separator = " ";
        int column = 1 ;

        for (int i = 0; i < args.length; i++) {
            if(args[i].startsWith("-d")) separator = args[i].substring(2);
            else if(args[i].startsWith("-f")) column = Integer.parseInt(args[i].substring(2));
            else if(args[i].endsWith(".txt")) content = cut.readFile(args[i]);
            else content = args[i];
        }
        System.out.println(content);
        System.out.println(cut.getSpecificFeild(column,content,separator));
    }
}
