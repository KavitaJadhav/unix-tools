package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest extends Tail {

    @Test
    public void testgetTail() throws Exception {
        Tail tail = new Tail();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on";

        String actual = tail.getTail(content,3);

        assertEquals(expected , actual);
    }
    @Test
    public void testPrintHead2() throws Exception {
        Tail tail = new Tail();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";

        String actual = tail.getTail(content,10);

        assertEquals(expected , actual);
    }


}
