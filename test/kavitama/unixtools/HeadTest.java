package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTest extends Head {
    @Test
    public void testPrintHead() throws Exception {
        Head head = new Head();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on";

        String actual = head.getHead(content,3);

        assertEquals(expected , actual);
    }
    @Test
     public void testPrintHead2() throws Exception {
        Head head = new Head();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";

        String actual = head.getHead(content,10);

        assertEquals(expected , actual);
    }

}
