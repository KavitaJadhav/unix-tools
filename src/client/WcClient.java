package client;

import kavitama.unixtools.WC;

public class WcClient {
    public static void main(String args[]){
        WC wc = new WC();
        String content = wc.readFile(args[0]);
        System.out.println("lines "+wc.getNoOfLines(content));
        System.out.println("words "+wc.getNoOfWords(content));
        System.out.println("characters "+wc.getNoOfCharacters(content));
    }
}
