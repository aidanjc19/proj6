import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhone9MaxTest {
    private static final OPhone9Max oPhone9Max = new OPhone9Max();

    @Test
    public void testAccessors() {
        assertEquals("OPhone9Max", oPhone9Max.getModel());
        assertEquals(632 * 1.2, oPhone9Max.getPrice());
        assertEquals(5, oPhone9Max.getCommsTech());
        assertEquals(10, oPhone9Max.getCameraCapacity());
        assertEquals(6.5, oPhone9Max.getScreenSize());
        assertEquals(1080, oPhone9Max.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(oPhone9Max.toString().startsWith(oPhone9Max.getModel()));
        assertTrue(oPhone9Max.toString().endsWith(oPhone9Max.getVidRes() + "P"));
    }
}

