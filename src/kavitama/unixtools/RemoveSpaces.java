package kavitama.unixtools;

public class RemoveSpaces extends ReadFile {

    private String removeBlankSpace(String content) {
        return content.replaceAll("[ ]+"," ");
    }

    public static void main(String args[]) {
        RemoveSpaces rs = new RemoveSpaces();
        String content = rs.readFile(args[0]);
        System.out.println(rs.removeBlankSpace(content));
    }
}
