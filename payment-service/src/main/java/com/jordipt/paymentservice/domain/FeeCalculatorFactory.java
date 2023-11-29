package com.jordipt.paymentservice.domain;

import org.springframework.stereotype.Service;

@Service
public class FeeCalculatorFactory {
    private final CreditCardFeeCalculator creditCardPaymentStrategy;
    private final PayPalFeeCalculator payPalPaymentStrategy;
    private final DebitCardFeeCalculator debitCardFeeCalculationService;

    public FeeCalculatorFactory(CreditCardFeeCalculator creditCardPaymentStrategy,
                                PayPalFeeCalculator payPalPaymentStrategy,
                                DebitCardFeeCalculator debitCardFeeCalculationService) {
        this.creditCardPaymentStrategy = creditCardPaymentStrategy;
        this.payPalPaymentStrategy = payPalPaymentStrategy;
        this.debitCardFeeCalculationService = debitCardFeeCalculationService;
    }

    public FeeCalculator generate(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case CREDIT_CARD -> creditCardPaymentStrategy;
            case DEBIT_CARD -> debitCardFeeCalculationService;
            case PAYPAL -> payPalPaymentStrategy;
        };
    }
}
