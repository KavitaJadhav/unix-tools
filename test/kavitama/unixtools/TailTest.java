package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest extends Tail {

    @Test
    public void getGivenNumberofLineAtTail() throws Exception {
        Tail tail = new Tail();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "whats going on\nkkk jjj \nkkk jjjj";

        String actual = tail.getTail(content,3);

        assertEquals(expected , actual);
    }
    @Test
    public void getAllLinesIfLinesLessThan10() throws Exception {
        Tail tail = new Tail();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";

        String actual = tail.getTail(content,10);

        assertEquals(expected , actual);
    }
    @Test
    public void get10LinesAtTail() throws Exception {
        Tail tail = new Tail();
        String content = "Hi\nhow \nr u \nwhats \ngoing \non\nkkk \njjj \nkkk \njjjj\nWhats";
        String expected = "how \nr u \nwhats \ngoing \non\nkkk \njjj \nkkk \njjjj\nWhats";

        String actual = tail.getTail(content,10);

        assertEquals(expected , actual);
    }
}
