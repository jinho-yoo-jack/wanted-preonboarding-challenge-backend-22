package com.wanted.clone.oneport.payments.domain.model;

record OrderInfo(
        String userId,
        String pdCode,
        String itemName,
        Long itemPrice,
        Long vatFreePrice,
        Long itemAmount
) {
}
