package seminar4.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seminar4.task1.PaymentGateway;
import seminar4.task1.PaymentProcessor;

import static org.mockito.Mockito.*;

public class PaymentProcessorMockTest {

    @Test
    public void testMakePaymentWithSuccessfulPayment() {
        // Создаем мок-объект PaymentGateway
        PaymentGateway mockGateway = mock(PaymentGateway.class);

        // Устанавливаем, что при вызове processPayment с любой суммой должен вернуться true
        when(mockGateway.processPayment(anyDouble())).thenReturn(true);

        // Создаем экземпляр PaymentProcessor, передавая мок-объект
        PaymentProcessor processor = new PaymentProcessor(mockGateway);

        // Вызываем метод makePayment с суммой 100.0
        boolean result = processor.makePayment(100.0);

        // Проверяем, что метод processPayment был вызван ровно один раз с любой суммой
        verify(mockGateway, times(1)).processPayment(anyDouble());

        // Проверяем результат, который должен быть true
        Assertions.assertTrue(result);
    }
}