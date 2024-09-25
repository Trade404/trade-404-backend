package com.ds.trade404.service;

import com.ds.trade404.modal.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt);
    public User findUserByEmail(String email);
    public User findUserById(Long userId);

    public User enableTwoFactorAuthentication(User user);

    User updatePassword(User user, String newPassword);


}
