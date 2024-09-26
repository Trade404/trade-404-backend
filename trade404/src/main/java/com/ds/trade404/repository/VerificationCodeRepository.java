package com.ds.trade404.repository;

import com.ds.trade404.modal.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {

    public VerificationCode findUserById(Long userId);
}
