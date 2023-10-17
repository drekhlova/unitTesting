package seminar3HW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberInIntervalTest extends NumberInInterval {

    //Проверка, что число находится в интервале от 25 до 100
    @Test
    @DisplayName("Проверка числа в интервале от 25 до 100")
    public void testNumberInInterval() {
        Assertions.assertTrue(numberInInterval(50));
        Assertions.assertFalse(numberInInterval(24));
        Assertions.assertFalse(numberInInterval(101));
        Assertions.assertTrue(numberInInterval(25));
        Assertions.assertTrue(numberInInterval(100));
        //Assertions.assertTrue(numberInInterval(26));
        //Assertions.assertTrue(numberInInterval(99));
    }
}
