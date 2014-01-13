package kavitama.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kavitama on 1/13/14.
 */
public class RemoveSpacesTest extends RemoveSpaces {
    @Test
    public void testRemoveBlankSpace() throws Exception {
        RemoveSpaces rs = new RemoveSpaces();
        String content = "Hi     \nhow      r u \nwhats       going on\nkkk     jjj \nkkk jjjj";
        String expected = "Hi \nhow r u \nwhats going on\nkkk jjj \nkkk jjjj";

        String actual = rs.removeBlankSpace(content);

        assertEquals(expected , actual);
    }
}
