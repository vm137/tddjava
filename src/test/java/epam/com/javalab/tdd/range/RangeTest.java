package epam.com.javalab.tdd.range;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RangeTest {
    private Range range1, range2, range3;

    @BeforeEach
    void setUp() throws Exception {
         range1 = new Range(100, 200);
         range2 = new Range(300, 400);
         range3 = new Range(150, 350);
    }

    @Test
    @DisplayName("== isBefore")
    void    isBefore() throws RangeWrongBounds {
        assertThat(range1.isBefore(range2), is(true));
        assertThat(range1.isBefore(range3), is(false));
    }

    @Test
    void isAfter() {
    }

    @Test
    void isConcurrent() {
    }

    @Test
    void getLowerBound() {
    }

    @Test
    void getUpperBound() {
    }

    @Test
    void contains() {
    }

    @Test
    void asList() {
    }

    @Test
    @DisplayName("== iterator")
    void iterator() {
    }

    @Disabled
    @Test
    @DisplayName("== iterator disabled")
    void iterator2() {
    }
}