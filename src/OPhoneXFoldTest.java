import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhoneXFoldTest {

    private static final OPhoneXFold oPhoneXFold = new OPhoneXFold();

    @Test
    public void testAccessors() {
        assertEquals("OPhoneXFold", oPhoneXFold.getModel());
        assertEquals(869 * 1.15, oPhoneXFold.getPrice(), 0.001);
        assertEquals(5, oPhoneXFold.getCommsTech());
        assertEquals(12, oPhoneXFold.getCameraCapacity());
        assertEquals(7.5, oPhoneXFold.getScreenSize());
        assertEquals(1080, oPhoneXFold.getVidRes());
        assertEquals("foldable", oPhoneXFold.getExtraFeatures());
    }

    @Test
    public void testToString() {
        assertTrue(oPhoneXFold.toString().startsWith(oPhoneXFold.getModel()));
        assertTrue(oPhoneXFold.toString().endsWith(oPhoneXFold.getExtraFeatures()));
    }
}


