package kavitama.unixtools;

public class RemoveSpaces extends ReadWriteFile {

    public String removeBlankSpace(String content) {
        return content.replaceAll("[ ]+"," ");
    }

    public static void main(String args[]) {
        RemoveSpaces rs = new RemoveSpaces();
        String content = rs.readFile(args[0]);
        content = rs.removeBlankSpace(content);
        rs.writeFile(content,args[1]);
    }
}
