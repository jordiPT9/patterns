package com.jordipt.paymentservice.infrastructure.entrypoint;

import com.jordipt.paymentservice.domain.PaymentMethod;
import com.jordipt.paymentservice.application.process_payment.ProcessPaymentUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class ProcessPaymentController {
    private final ProcessPaymentUseCase processPaymentUseCase;

    public ProcessPaymentController(ProcessPaymentUseCase processPaymentUseCase) {
        this.processPaymentUseCase = processPaymentUseCase;
    }

    @PostMapping
    public void processPayment(@RequestParam PaymentMethod paymentMethod, @RequestParam double amount) {
        processPaymentUseCase.execute(paymentMethod, amount);
    }
}
