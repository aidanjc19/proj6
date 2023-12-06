import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OPhone8MiniTest {

    private static final OPhone8Mini ophone8mini = new OPhone8Mini();

    @Test
    public void testAccessors() {
        assertEquals("OPhone8Mini", ophone8mini.getModel());
        assertEquals(474 * 1.1, ophone8mini.getPrice());
        assertEquals(4, ophone8mini.getCommsTech());
        assertEquals(8, ophone8mini.getCameraCapacity());
        assertEquals(4.6, ophone8mini.getScreenSize());
        assertEquals(720, ophone8mini.getVidRes());
    }

    @Test
    public void testToString() {
        assertTrue(ophone8mini.toString().startsWith(ophone8mini.getModel()));
        assertTrue(ophone8mini.toString().endsWith(ophone8mini.getVidRes() + "P"));
    }


}

