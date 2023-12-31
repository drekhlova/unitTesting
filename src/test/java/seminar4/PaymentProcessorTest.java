package seminar4;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PaymentProcessorTest {
    @Test
    public void testDummyPaymentProcessor() {
        PaymentGateway dummyGateway = new DummyPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(dummyGateway);
        // Теперь можно тестировать PaymentProcessor с использованием DummyPaymentGateway
        boolean result = processor.makePayment(1000);
    }

    @Test
    public void testStubPaymentProcessor() {
        PaymentGateway stubGateway = new StubPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(stubGateway);

        boolean result = processor.makePayment(1000);
    }

    @Test
    public void testSpyPaymentProcessor() {
        PaymentGateway spyGateway = new SpyPaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(spyGateway);

        // Вызываем метод makePayment
        boolean result = processor.makePayment(100.0);

        // Проверяем, что метод processPayment был вызван
        Assertions.assertEquals(1, ((SpyPaymentGateway) spyGateway).getProcessPaymentCallCount());

        // Проверяем результат
        Assert.assertTrue(result);
    }

    @Test
    public void testFakePaymentProcessor() {
        PaymentGateway fakeGateway = new FakePaymentGateway();
        PaymentProcessor processor = new PaymentProcessor(fakeGateway);

// Вызываем метод makePayment с разными суммами
        processor.makePayment(100.0);
        processor.makePayment(50.0);
        processor.makePayment(200.0);

// Получаем историю платежей
        List<Double> paymentHistory = ((FakePaymentGateway) fakeGateway).getPaymentHistory();

// Проверяем, что платежи были записаны правильно
        Assertions.assertEquals(3, paymentHistory.size());
        Assertions.assertEquals(100.0, paymentHistory.get(0));
        Assertions.assertEquals(50.0, paymentHistory.get(1));
        Assertions.assertEquals(200.0, paymentHistory.get(2));
    }
}