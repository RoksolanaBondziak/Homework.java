import static org.junit.jupiter.api.Assertions.*;

import m8homework.WeekDays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class daysOfTheWeekTest {


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    public void positiveTest(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<String>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        String expectedResult = daysList.get(dayNumber - 1);
        String actualResult = WeekDays.getDay(dayNumber);


        assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @ValueSource(ints = {0, -5, -345476})
    public void negative1Test(Integer dayNumber) {

        String expectedResult = "The number should be equal or larger than 1";
        String actualResult = "The number should be equal or larger than 1";
        assertFalse(dayNumber >= 1);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 10, 345476})
    public void negative2Test(Integer dayNumber) {
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = "The number should be equal or smaller than 7";
        assertFalse(dayNumber <= 7);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @DisplayName("NullPointer exception Test")
    public void errorTest() {
        Integer dayNumber = null;

        assertThrows(NullPointerException.class, () -> {
            WeekDays.getDay(null);
        });
    }
}
