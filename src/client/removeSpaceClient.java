package client;

import kavitama.unixtools.RemoveSpaces;

public class removeSpaceClient {
    public static void main(String args[]) {
        RemoveSpaces rs = new RemoveSpaces();
        String content = rs.readFile(args[0]);
        content = rs.removeBlankSpace(content);
        rs.writeFile(content,args[1]);
    }
}
