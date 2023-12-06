import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhoneXTest {

    private static final OPhoneX oPhoneX = new OPhoneX();

    @Test
    public void testAccessors() {
        assertEquals("OPhoneX", oPhoneX.getModel());
        assertEquals(790 * 1.1, oPhoneX.getPrice());
        assertEquals(5, oPhoneX.getCommsTech());
        assertEquals(12, oPhoneX.getCameraCapacity());
        assertEquals(6.7, oPhoneX.getScreenSize());
        assertEquals(1080, oPhoneX.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(oPhoneX.toString().startsWith(oPhoneX.getModel()));
        assertTrue(oPhoneX.toString().endsWith(oPhoneX.getVidRes() + "P"));
    }


}

