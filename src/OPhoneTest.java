import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhoneTest {

    private static final OPhone ophone = new OPhone();

    @Test
    public void testAccessors() {
        assertEquals("OPhone", ophone.getModel());
        assertEquals(790, ophone.getPrice());
        assertEquals(4, ophone.getCommsTech());
        assertEquals(8, ophone.getCameraCapacity());
        assertEquals(0, ophone.getScreenSize());
        assertEquals(0, ophone.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(ophone.toString().startsWith(ophone.getModel()));
        assertTrue(ophone.toString().endsWith(ophone.getVidRes() + "P"));
    }


}
