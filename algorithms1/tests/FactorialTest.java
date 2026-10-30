import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
            "10, 3628800",
            "20, 2432902008176640000"
    })
    @DisplayName("Проверка расчета факториала для long и BigInteger")
    void testFactorialMatching(int n, String expectedStr) {
        long expectedLong = Long.parseLong(expectedStr);
        BigInteger expectedBigInt = new BigInteger(expectedStr);

        assertEquals(expectedLong, Factorial.factorialLong(n));
        assertEquals(expectedBigInt, Factorial.factorialBigInteger(n));
    }

    @Test
    @DisplayName("Поиск значения n, с которого long переполняется")
    void testOverflowPoint() {
        int firstOverflowN = -1;

        for (int n = 1; n <= 30; n++) {
            long longResult = Factorial.factorialLong(n);
            BigInteger bigResult = Factorial.factorialBigInteger(n);

            if (!BigInteger.valueOf(longResult).equals(bigResult)) {
                firstOverflowN = n;
                break;
            }
        }

        assertEquals(21, firstOverflowN);
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialLong(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialBigInteger(-1));
    }
}