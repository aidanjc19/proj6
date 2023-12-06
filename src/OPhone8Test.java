import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhone8Test {

    private static final OPhone8 ophone8 = new OPhone8();

    @Test
    public void testAccessors() {
        assertEquals("OPhone8", ophone8.getModel());
        assertEquals(790 * 0.6, ophone8.getPrice());
        assertEquals(4, ophone8.getCommsTech());
        assertEquals(8, ophone8.getCameraCapacity());
        assertEquals(5.5, ophone8.getScreenSize());
        assertEquals(720, ophone8.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(ophone8.toString().startsWith(ophone8.getModel()));
        assertTrue(ophone8.toString().endsWith(ophone8.getVidRes() + "P"));
    }


}
