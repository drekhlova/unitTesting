package seminar6HW;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    /* В этом случае список numbers1 содержит большие числа, чем numbers2, поэтому среднее значение
    list1 должно быть больше, чем у list2. */
    @Test
    @DisplayName("Первый список имеет большее среднее значение")
    public void testCompareAverages_firstListHasGreaterAverage() {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List list1 = new List(numbers1);
        List list2 = new List(numbers2);

        Average average = new Average(list1, list2);

        String expected = "Первый список имеет большее среднее значение";
        String actual = average.compareAverages();
        assertEquals(expected, actual);
    }

    /* Список numbers1 содержит меньшие числа, чем numbers2, поэтому среднее значение list1
    должно быть меньше, чем у list2. */
    @Test
    @DisplayName("Второй список имеет большее среднее значение")
    public void testCompareAverages_secondListHasGreaterAverage() {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        List list1 = new List(numbers1);
        List list2 = new List(numbers2);

        Average average = new Average(list1, list2);

        String expected = "Второй список имеет большее среднее значение";
        String actual = average.compareAverages();
        assertEquals(expected, actual);
    }

    /* Оба списка содержат одинаковые числа, поэтому средние значения list1 и list2
    должны быть равны */
    @Test
    @DisplayName("Средние значения равны")
    public void testCompareAverages_listsHaveEqualAverage() {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List list1 = new List(numbers1);
        List list2 = new List(numbers2);

        Average average = new Average(list1, list2);

        String expected = "Средние значения равны";
        String actual = average.compareAverages();
        assertEquals(expected, actual);
    }
}

