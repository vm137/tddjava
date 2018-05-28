package epam.com.javalab.tdd.param;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ParamTddTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    @DisplayName("Palindrome")
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }

    private boolean isPalindrome(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

}
