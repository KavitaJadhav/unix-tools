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


}
