package com.wanted.clone.oneport.payments.presentation.web.request.payment;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReqPaymentApprove {
    private String siteCode;
    private PgCorp selectedPgCorp;
    private String paymentKey;
    private String orderId;
    private int totalAmount;

    @Override
    public String toString(){
        return "PaymentApproveMessage [site_code=" + siteCode +
                ", pg_corp=" + selectedPgCorp.name() +
                ", payment_key=" + paymentKey +
                ", order_id=" + orderId +
                ", total_amount=" + totalAmount +
                "]";
    }
}