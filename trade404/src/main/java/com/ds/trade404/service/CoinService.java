package com.ds.trade404.service;

import com.ds.trade404.modal.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> getCoinList(int page);

    String getMarketChart(String coinId, int Days);

    String getCoinDetails(String coinId);

    Coin findById(String coinId);

    String searchCoin(String keyword);

    String getTop50CoinByMarketCapRank();

    String getTradingCoins();
}
