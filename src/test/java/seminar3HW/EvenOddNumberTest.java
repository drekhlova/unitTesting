package seminar3HW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddNumberTest extends EvenOddNumber {

    //Проверка, что число четное
    @Test
    @DisplayName("Проверка четного числа")
    public void testEvenNumber() {
        Assertions.assertTrue(evenOddNumber(2));
    }

   //Проверка, что число нечетное
    @Test
    @DisplayName("Проверка нечетного числа")
    public void testOddNumber() {
        Assertions.assertFalse(evenOddNumber(3));
    }

    //Проверка числа на четное или нечетное
    @Test
    @DisplayName("Проверка числа на четное")
    void testEvenOddNumber() {
        int n = 2;
        assertEquals(evenOddNumber(n), true);
    }


}
