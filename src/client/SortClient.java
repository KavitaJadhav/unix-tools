package client;

import kavitama.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) {
        boolean reverse = false;
        String content ="";
        Sort sort = new Sort();


        for (int i = 0; i < args.length; i++) {
            if(args[i].startsWith("-r")) reverse = true;
            else if(args[i].endsWith(".txt")) content = sort.readFile(args[i]);
            else content = args[i];
        }

        if (reverse) System.out.println(sort.defaultReverseSort(content));
        else System.out.println(sort.defaultSort(content));
    }
}
