package com.jordipt.paymentservice.application.process_payment;

import com.jordipt.paymentservice.domain.PaymentMethod;
import com.jordipt.paymentservice.domain.FeeCalculator;
import com.jordipt.paymentservice.domain.FeeCalculatorFactory;
import org.springframework.stereotype.Service;

@Service
public class ProcessPaymentUseCase {
    private final FeeCalculatorFactory feeCalculatorFactory;

    public ProcessPaymentUseCase(FeeCalculatorFactory feeCalculatorFactory) {
        this.feeCalculatorFactory = feeCalculatorFactory;
    }

    public void execute(PaymentMethod paymentMethod, double amount) {
        FeeCalculator feeCalculator = feeCalculatorFactory.generate(paymentMethod);
        double fee = feeCalculator.calculateFee(amount);
        double totalAmount = amount + fee;

        // resto del codigo...
        System.out.println(totalAmount);
    }
}
