package com.ds.trade404.service;

import com.ds.trade404.modal.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> getCoinList(int page) throws Exception;

    String getMarketChart(String coinId, int days) throws Exception;

    String getCoinDetails(String coinId) throws Exception;

    Coin findById(String coinId);

    String searchCoin(String keyword);

    String getTop50CoinByMarketCapRank();

    String getTradingCoins();
}
