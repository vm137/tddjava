package epam.com.javalab.tdd.range;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static  org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    @DisplayName("== isAfter")
    void isAfter() {
        assertThat(range2.isAfter(range1), is(true));
        assertThat(range1.isAfter(range3), is(false));
    }

    @Test
    @DisplayName("== isConcurrent")
    void isConcurrent() {
        assertThat(range1.isConcurrent(range3), is(true));
        assertThat(range1.isConcurrent(range2), is(false));
    }

    @Test
    void getLowerBound() {
        assertThat(range1.getLowerBound() == 100, is(true));
        assertThat(range2.getLowerBound() == 50, is(false));
        assertThat(range2.getLowerBound(), is(300L));
    }

    @Test
    void getUpperBound() {
        assertThat(range1.getUpperBound(), is(200L));
        assertThat(range3.getUpperBound(), is(350L));
    }

    @ParameterizedTest
    @ValueSource(longs = {100L, 150L})
    @DisplayName("== contains")
    void contains(long arg) {
         assertTrue(range1.contains(arg));
         assertThat(range2.contains(arg), is(false));
    }

    @Test
    void asList() {

    }

    @Test
    @DisplayName("== iterator")
    void iterator() {
    }

    @Test
    void rangeThrows() throws RangeWrongBounds {
        Throwable exception = assertThrows(RangeWrongBounds.class, () -> {
            Range range0 = new Range(200, 100);
        });
    }

    @Disabled
    @Test
    @DisplayName("== iterator disabled")
    void iterator2() {
    }
}
