package com.ds.trade404.service;

import com.ds.trade404.modal.Coin;
import com.ds.trade404.modal.User;
import com.ds.trade404.modal.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId);

    Watchlist createWatchlist(User user);

    Watchlist findById(Long id);

    Coin addItemToWatchlist(Coin coin, User user);
}
