import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "7, 7",
            "572, 14",
            "1005, 6"
    })
    @DisplayName("Проверка суммы цифр (базовые и рекурсивные случаи)")
    void testSumOfDigits(int input, int expected) {
        assertEquals(expected, FirstTask.sumOfDigits(input));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FirstTask.sumOfDigits(-5));
    }
}