import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhone9Test {
    private static final OPhone9 oPhone9 = new OPhone9();

    @Test
    public void testAccessors() {
        assertEquals("OPhone9", oPhone9.getModel());
        assertEquals(790 * 0.8, oPhone9.getPrice());
        assertEquals(5, oPhone9.getCommsTech());
        assertEquals(10, oPhone9.getCameraCapacity());
        assertEquals(5.6, oPhone9.getScreenSize());
        assertEquals(1080, oPhone9.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(oPhone9.toString().startsWith(oPhone9.getModel()));
        assertTrue(oPhone9.toString().endsWith(oPhone9.getVidRes() + "P"));
    }
}
