package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTest extends Head {
    @Test
    public void getPrintGivenNumberofLineAtHead() throws Exception {
        Head head = new Head();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on";

        String actual = head.getHead(content,3);

        assertEquals(expected , actual);
    }
    @Test
     public void getPrintAllLinesIfLessThanTen() throws Exception {
        Head head = new Head();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";

        String actual = head.getHead(content,10);

        assertEquals(expected , actual);
    }
    @Test
    public void getPrint10LinesAtHead() throws Exception {
        Head head = new Head();
        String content = "Hi\nhow \nr u \nwhats \ngoing \non\nkkk \njjj \nkkk \njjjj\nWhats";
        String expected = "Hi\nhow \nr u \nwhats \ngoing \non\nkkk \njjj \nkkk \njjjj";

        String actual = head.getHead(content,10);

        assertEquals(expected , actual);
    }
}
