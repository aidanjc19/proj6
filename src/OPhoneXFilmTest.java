import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhoneXFilmTest {

    private static final OPhoneXFilm oPhoneXFilm = new OPhoneXFilm();

    @Test
    public void testAccessors() {
        assertEquals("OPhoneXFilm", oPhoneXFilm.getModel());
        assertEquals(869 * 1.25, oPhoneXFilm.getPrice(), 0.001);
        assertEquals(5, oPhoneXFilm.getCommsTech());
        assertEquals(12, oPhoneXFilm.getCameraCapacity());
        assertEquals(6.7, oPhoneXFilm.getScreenSize());
        assertEquals(4, oPhoneXFilm.getVidRes());
        assertEquals("slow motion", oPhoneXFilm.getExtraFeatures());
    }

    @Test
    public void testToString() {
        assertTrue(oPhoneXFilm.toString().startsWith(oPhoneXFilm.getModel()));
        assertTrue(oPhoneXFilm.toString().endsWith(oPhoneXFilm.getExtraFeatures()));
    }
}

