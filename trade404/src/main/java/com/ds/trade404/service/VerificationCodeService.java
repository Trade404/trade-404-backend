package com.ds.trade404.service;

import com.ds.trade404.domain.VerificationType;
import com.ds.trade404.modal.User;
import com.ds.trade404.modal.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);

    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId);

    void deleteVerificationCodeById(VerificationCode verificationCode);


}
