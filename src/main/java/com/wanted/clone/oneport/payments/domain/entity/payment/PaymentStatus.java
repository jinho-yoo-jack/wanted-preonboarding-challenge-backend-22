package com.wanted.clone.oneport.payments.domain.entity.payment;

/*
DONE, CANCELED, PARTIAL_CANCELED, SETTLEMENTS_REQUESTED, SETTLEMENTS_COMPLETED
*/
public enum PaymentStatus {
    DONE,
    PARTIAL_CANCELED,
    CANCELED,
    SETTLEMENTS_REQUESTED,
    SETTLEMENTS_COMPLETED,
    SETTLEMENTS_CANCELED
}
