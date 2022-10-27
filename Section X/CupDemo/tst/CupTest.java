import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testObjectCreation() {
        Cup cup = new Cup("Water", 85.0);
        assertEquals("Water", cup.getLiquidType());
        assertEquals(85.0, cup.getPercentFull(), 0.001);
    }

    @Test
    void testIsEmpty() {
        Cup cup = new Cup("Water", 85.0);
        assertFalse(cup.isEmpty());
    }
}