package D0906_BasicJava_2Days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddEvenTest {

    @Test
    public void isOddTest() {
        assertTrue(OddEven.isOdd(3));
        assertFalse(OddEven.isOdd(4));
        assertTrue(OddEven.isOdd(5));
        assertTrue(OddEven.isOdd(101));
        // assertTrue(OddEven.isOdd(-101));
    }
}
