package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kavitama on 1/13/14.
 */
public class CutTest extends Cut {
    @Test
    public void testGetSpecificFeild() throws Exception {
        Cut cut = new Cut();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "Hi\nhow\nwhats\nkkk\nkkk";

        String actual = cut.getSpecificFeild(1,content," ");

        assertEquals(expected , actual);
    }
    @Test
    public void testGetSpecificFeild2() throws Exception {
        Cut cut = new Cut();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";
        String expected = "\nu\non\n\n";

        String actual = cut.getSpecificFeild(3,content," ");

        assertEquals(expected , actual);
    }

}
