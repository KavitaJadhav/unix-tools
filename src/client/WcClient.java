package client;

import kavitama.unixtools.WC;

class Option {
    boolean wordCount = false ;
    boolean lineCount = false;
    boolean charCount = false;
}

public class WcClient {
    public static void main(String args[]){
        WC wc = new WC();
        String content = wc.readFile(args[0]);

        Option op  = getOptions(args);
        if(op.lineCount) System.out.println("lines "+wc.getNoOfLines(content));
        if(op.wordCount) System.out.println("words "+wc.getNoOfWords(content));
        if(op.charCount) System.out.println("characters "+wc.getNoOfCharacters(content));
    }

    private static Option getOptions(String[] args) {
        Option op = new Option();

        if(args.length == 1){
            op.charCount = op.lineCount = op.wordCount =true ;
            return op;
        }
        for (int i = 1; i < args.length; i++) {
            op.wordCount = args[i].contains("w");
            op.lineCount  =args[i].contains("l");
            op.charCount  =args[i].contains("c");
        }
        return op;
    }
}
