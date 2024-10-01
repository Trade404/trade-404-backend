package com.ds.trade404.service;

import com.ds.trade404.modal.Order;
import com.ds.trade404.modal.User;
import com.ds.trade404.modal.Wallet;


public interface WalletService {

    Wallet getUserWallet(User user);

    Wallet addBalance(Wallet wallet, Long amount);

    Wallet findWalletById(Long id);

    Wallet walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount);

    Wallet payOrderPayment(Order order, User user);
}
