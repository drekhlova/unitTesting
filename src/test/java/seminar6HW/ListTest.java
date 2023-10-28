package seminar6HW;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListTest {
    @Test
    @DisplayName("Тест на получение среднего значения списка")
    public void testGetAverage() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List list = new List(numbers);
        double expected = 2.0;
        double actual = list.getAverage();
        assertEquals(expected, actual, 0.001);
    }

    /* @Test
    @DisplayName("Тест на получение среднего значения пустого списка")
    public void testGetAverageEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        List list = new List(numbers);
        double expected = 0.0;
        double actual = list.getAverage();
        assertEquals(expected, actual, 0.001);
    }
    */
}
