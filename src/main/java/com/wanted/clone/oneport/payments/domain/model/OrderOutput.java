package com.wanted.clone.oneport.payments.domain.model;

import com.google.type.DateTime;

public record OrderOutput(
        String tid,
        OrderInfo orderInfo,
        DateTime endTime,
        String redirectUrl
) {
}
