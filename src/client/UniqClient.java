package client;

import kavitama.unixtools.Uniq;

public class UniqClient {

    public static void main(String args[]) {
        Uniq u = new Uniq();
        String content = u.readFile(args[0]);
        System.out.println(u.getUniqLines(content));
    }
}
