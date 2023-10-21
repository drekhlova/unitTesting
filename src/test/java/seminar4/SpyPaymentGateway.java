package seminar4.task1;

import seminar4.task1.PaymentGateway;

public class SpyPaymentGateway implements PaymentGateway {
    private int processPaymentCallCount = 0;

    @Override
    public boolean processPayment(double amount) {
        processPaymentCallCount++;
        // Возвращаем true, как настоящий платежный шлюз
        return true;
    }

    public int getProcessPaymentCallCount() {
        return processPaymentCallCount;
    }
}
