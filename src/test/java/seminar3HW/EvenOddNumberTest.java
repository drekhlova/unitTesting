package seminar3HWTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class evenOddNumberTest {
    @Test
    @DisplayName("Проверка четного числа")
    public void testEvenNumber() {
        evenOddNumber eon = new EvenOddNumber();
        assertTrue(eon.evenOddNumber(4));
    }

    @Test
    @DisplayName("Проверка нечетного числа")
    public void testOddNumber() {
        evenOddNumber eon = new EvenOddNumber();
        assertFalse(eon.evenOddNumber(7));
    }
}
