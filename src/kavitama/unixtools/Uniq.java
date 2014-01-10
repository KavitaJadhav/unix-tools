package kavitama.unixtools;

public class Uniq extends ReadFile {
    public String displayUniqLines(String content) {
        String[] lines = content.split("\n");
        String result = "";
        for (int i = 0; i < lines.length-1; i++) {
            if (!(lines[i].equals(lines[i + 1]))) {
                result += lines[i]+"\n";
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static void main(String args[]) {
        Uniq u = new Uniq();
        String content = u.readFile(args[0]);
        System.out.println(u.displayUniqLines(content));
    }
}
