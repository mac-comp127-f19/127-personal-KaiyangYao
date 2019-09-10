package BasicJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {
    @Test
    public void testSimple(){
        assertEquals(5,Hypotenuse.calculateHypotenuse(3,4));
    }

}
