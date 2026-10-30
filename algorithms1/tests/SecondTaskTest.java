import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @ParameterizedTest
    @CsvSource({
            "0, 10, 5, 10",
            "4, 12, -3, 0",
            "3, 5, 2, 11"
    })
    @DisplayName("Проверка уровня сигнала (базовый и рекурсивные случаи)")
    void testSignal(int n, int first, int difference, int expected) {
        assertEquals(expected, SecondTask.signal(n, first, difference));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> SecondTask.signal(-1, 5, 2));
    }
}