package com.jordipt.paymentservice.domain;

import org.springframework.stereotype.Service;

@Service
public class DebitCardFeeCalculator implements FeeCalculator {
    @Override
    public double calculateFee(double amount) {
        System.out.println("Calculating fee with debit card...");
        // más llamadas a repository, etc

        return amount * 0.04;
    }
}
