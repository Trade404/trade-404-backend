package com.ds.trade404.service;

import com.ds.trade404.domain.PaymentMethod;
import com.ds.trade404.modal.PaymentOrder;
import com.ds.trade404.modal.User;
import com.ds.trade404.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user,
                             Long amount,
                             PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id);

    Boolean proceedPaymentOrder(PaymentOrder paymentOrder, String paymentId);

    PaymentResponse createRazorpayPaymentLink(User user, Long amount);

    PaymentResponse createStripePaymentLink(User user, Long amount, Long orderId);
}
