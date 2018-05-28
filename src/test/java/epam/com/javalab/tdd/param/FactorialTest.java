package epam.com.javalab.tdd.param;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.core.Is.*;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("==Factorial")
    void test() {

        assertEquals(120, Factorial.factorial(5));
        assertEquals(3628800, Factorial.factorial(10));

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-5);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(Factorial.factorial(argument) > 0 && argument < 10);
        assertNotEquals(Factorial.factorial(argument), 0);
    }

    @Disabled
    @Test
    @DisplayName("==Disabled")
    void disabledMethod() {
        assertNotEquals(Factorial.factorial(1), is(5));
    }

}
