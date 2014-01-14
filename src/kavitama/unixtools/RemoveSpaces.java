package kavitama.unixtools;

public class RemoveSpaces extends ReadWriteFile {

    public String removeBlankSpace(String content) {
        return content.replaceAll("[ ]+"," ");
    }
}
