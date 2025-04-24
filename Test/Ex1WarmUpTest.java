import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1WarmUpTest {

    @Test
    void sleepIn_returnsTrue_givenWeekdayIsFalseAndVacationIsFalse() {
        Ex1WarmUp one = new Ex1WarmUp();
        assertTrue(one.sleepIn(false, false));
    }

    @Test
    void sleepIn_returnsFalse_givenWeekdayIsTrueAndVacationIsFalse() {
        Ex1WarmUp one = new Ex1WarmUp();
        assertFalse(one.sleepIn(true, false));
    }

    @Test
    void sleepIn_returnsTrue_givenWeekdayIsFalseAndVacationIsTrue() {
        Ex1WarmUp one = new Ex1WarmUp();
        assertTrue(one.sleepIn(false, true));
    }

    @Test
    void sleepIn_returnsTrue_givenWeekdayIsTrueAndVacationIsTrue() {
        Ex1WarmUp one = new Ex1WarmUp();
        assertTrue(one.sleepIn(true, true));
    }

    @Test
    void sumDouble() {
        Ex1WarmUp(); two = new Ex1WarmUp();

    }
}