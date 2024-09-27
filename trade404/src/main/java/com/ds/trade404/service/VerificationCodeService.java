package com.ds.trade404.service;

import com.ds.trade404.modal.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(VerificationCode verificationCode);

    VerificationCode getVerificationCodeById(Long id);

    VerificationCode getVerificationCodeByUser(Long userId);

    void deleteVerificationCodeById(VerificationCode verificationCode);


}
