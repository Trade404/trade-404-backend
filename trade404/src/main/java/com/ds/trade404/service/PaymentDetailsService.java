package com.ds.trade404.service;

import com.ds.trade404.modal.PaymentDetails;
import com.ds.trade404.modal.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber,
                                            String accountHolderName,
                                            String ifsc,
                                            String bankName,
                                            User user);

    public PaymentDetails getUsersPaymentDetails(User user);

}
