package com.wanted.clone.oneport.payments.domain.model;

record PgCredential(
        String pgCode,
        String cid,
        String secretKey
) {
}