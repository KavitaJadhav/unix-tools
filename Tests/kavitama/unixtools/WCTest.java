package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kavitama on 1/8/14.
 */
public class WCTest {
    @Test
    public void testGetNoOfLines() throws Exception {
        WC wc = new WC();
        String content = "Hi\nhow r u \n whats going on";
        int expected = 3;

        int actual = wc.getNoOfLines(content);

        assertEquals(expected , actual);
    }

    @Test
    public void testGetNoOfWords() throws Exception {
        WC wc = new WC();
        String content = "Hi\nhow r u \nwhats going on";
        int expected = 7;

        int actual = wc.getNoOfWords(content);

        assertEquals(expected , actual);
    }

    @Test
    public void testGetNoOfCharacters() throws Exception {
        WC wc = new WC();
        String content = "Hi\nhow r u \nwhats going on";
        int expected = 27;

        int actual = wc.getNoOfCharacters(content);

        assertEquals(expected , actual);
    }
}
