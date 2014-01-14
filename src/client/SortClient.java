package client;

import kavitama.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) {
        Sort sort = new Sort();
        System.out.println(sort.defaultSort("aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb"));
        System.out.println(sort.defaultReverseSort("aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb"));
    }
}
