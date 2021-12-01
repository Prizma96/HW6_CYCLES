package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'range from 200 to 300', 200, 300, 3",
            "'range from 100 to 10000', 10, 10000, 90",
            "'range from 10 to 99', 10, 99, 0",})
    public void shouldSqrCounter(String ignoredTestName, int from, int to, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.sqrCounter(from, to);

        assertEquals(expected, actual);

    }
}