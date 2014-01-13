package kavitama.unixtools;

public class Cut extends ReadWriteFile {
    public String getSpecificFeild(int column ,String content, String separator) {
        String field = "";
        String[] lines = content.split("\n");
        String[] words;
        for (int i = 0; i < lines.length; i++) {
            words = lines[i].split(separator);
            if(words.length >= column) field += words[column-1]+"\n";
            else  field +="\n";
        }
        return field.substring(0 , field.length()-1);
    }

    public static void main(String args[]) {
        Cut cut = new Cut();
        String content="" , separator = " ";
        int column = 0 ;

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
