package com.ds.trade404;

import lombok.Data;

@Data
public class ForgotPasswordTokenRequest {
    private String sendTo;
    private String otp;
}
