import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvenOrOdd {

    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.even_or_odd(12));
    }

}
