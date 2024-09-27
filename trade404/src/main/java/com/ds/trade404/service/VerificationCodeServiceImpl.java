package com.ds.trade404.service;

import com.ds.trade404.domain.VerificationType;
import com.ds.trade404.modal.User;
import com.ds.trade404.modal.VerificationCode;
import com.ds.trade404.repository.VerificationCodeRepository;
import com.ds.trade404.utils.OtpUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class VerificationCodeServiceImpl  implements VerificationCodeService {

    @Autowired
    private VerificationCodeRepository verificationCodeRepository;


    @Override
    public VerificationCode sendVerificationCode(User user, VerificationType verificationType) {
        VerificationCode verificationCodeInner = new VerificationCode();
        verificationCodeInner.setOtp(OtpUtils.generateOTP());
        verificationCodeInner.setVerificationType(verificationType);
        verificationCodeInner.setUser(user);

        return verificationCodeRepository.save(verificationCodeInner);
    }

    @Override
    public VerificationCode getVerificationCodeById(Long id) throws Exception {
        Optional<VerificationCode> verificationCode =
                verificationCodeRepository.findById(id);
        if(verificationCode.isPresent()) {
            return verificationCode.get();
        }
        throw new Exception("verification code not found");
    }

    @Override
    public VerificationCode getVerificationCodeByUser(Long userId) {
        return verificationCodeRepository.findUserById(userId);
    }

    @Override
    public void deleteVerificationCodeById(VerificationCode verificationCode) {
        verificationCodeRepository.delete(verificationCode);
    }
}
