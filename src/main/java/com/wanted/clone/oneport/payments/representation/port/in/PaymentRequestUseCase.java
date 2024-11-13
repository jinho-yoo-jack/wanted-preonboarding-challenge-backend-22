package com.wanted.clone.oneport.payments.representation.port.in;

import org.springframework.ui.Model;

/**
 * 포트 : 시스템 간의 경계 지정
 * 외부 요청이 앱 내부로 들어올 때 사용할 인터페이스
 */
public interface PaymentRequestUseCase {
    String renderPgUi();
}
