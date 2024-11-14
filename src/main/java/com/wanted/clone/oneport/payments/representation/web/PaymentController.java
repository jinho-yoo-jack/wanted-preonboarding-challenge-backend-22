package com.wanted.clone.oneport.payments.representation.web;

import com.wanted.clone.oneport.payments.representation.port.in.PaymentRequestUseCase;
import com.wanted.clone.oneport.payments.representation.web.request.PaymentRequestMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentRequestUseCase paymentRequestUseCase;

    @GetMapping("/request")
    public String paymentRequest(PaymentRequestMessage message, Model model) {
        model.addAttribute("userId", "jinho-yoo");
        return paymentRequestUseCase.renderPgUi();
    }

}
