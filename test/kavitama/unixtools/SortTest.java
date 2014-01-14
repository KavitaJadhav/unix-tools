package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SortTest extends Sort {
    @Test
    public void testDefaultSort() throws Exception {
        String content ="aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb";
        String expected ="aaaaa\nbbbbbbbb\nhhhhhhhh\njjjjjj";

        String actual = defaultSort(content);

        assertEquals(expected , actual);
    }

    @Test
    public void testDefaultReverseSort() throws Exception {
        String content ="aaaaa\njjjjjj\nhhhhhhhh\nbbbbbbbb";
        String expected ="jjjjjj\nhhhhhhhh\nbbbbbbbb\naaaaa";

        String actual = defaultReverseSort(content);

        assertEquals(expected , actual);
    }
}
