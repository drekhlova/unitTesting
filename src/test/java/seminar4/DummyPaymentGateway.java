package seminar4.task1;

import seminar4.task1.PaymentGateway;

public class DummyPaymentGateway implements PaymentGateway {

    @Override public boolean processPayment(double amount){
        return true;
        // Не выполняем никаких действий, просто фиктивный объект return true;
    }
}
