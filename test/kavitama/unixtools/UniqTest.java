package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqTest extends Uniq {
    @Test
    public void testGetUniqLines() throws Exception {
        Uniq uniq = new Uniq();
        String content = "Hi\nhow r u \nwhats going on\nkkk jjj\nkkk jjj";
        String expected = "Hi\nhow r u \nwhats going on\nkkk jjj";

        String actual = uniq.getUniqLines(content);

        assertEquals(expected , actual);

    }
}
