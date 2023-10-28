package seminar6HW;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    /* Тест проверяет, что метод main() правильно объединяет два списка и выводит результат в консоль.
    ByteArrayOutputStream и System.setOut() используются для перехвата вывода в консоль
    и проверки содержимого */

    @Test
    @DisplayName("Тестирование метода main: объединение двух списков и вывод результата")
    public void testMainMethod() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "Объединенный список: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

