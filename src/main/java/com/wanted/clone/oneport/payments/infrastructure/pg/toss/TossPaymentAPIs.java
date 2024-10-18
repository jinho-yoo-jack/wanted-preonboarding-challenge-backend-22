package com.wanted.clone.oneport.payments.infrastructure.pg.toss;

import com.wanted.clone.oneport.payments.infrastructure.pg.toss.response.ResponsePaymentApproved;
import com.wanted.clone.oneport.payments.infrastructure.pg.toss.response.ResponsePaymentCancel;
import com.wanted.clone.oneport.payments.infrastructure.pg.toss.response.ResponsePaymentSettlements;
import com.wanted.clone.oneport.payments.representation.web.request.PaymentApproveMessage;
import com.wanted.clone.oneport.payments.representation.web.request.PaymentCancelMessage;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface TossPaymentAPIs {
    @POST("payments/confirm")
    Call<ResponsePaymentApproved> paymentFullfill(@Body PaymentApproveMessage requestMessage);

    @POST("payments/{paymentKey}/cancel")
    Call<ResponsePaymentCancel> paymentCancel(@Path("paymentKey") String paymentKey, @Body PaymentCancelMessage requestMessage);

    @GET("settlements")
    Call<List<ResponsePaymentSettlements>> paymentSettlements(@Path("startDate") String startDate,
                                                              @Path("endDate") String endDate,
                                                              @Path("page") int page,
                                                              @Path("size") int size);
}