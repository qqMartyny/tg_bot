package com.ilyanin.exchangeratesbot.service;

import com.ilyanin.exchangeratesbot.exception.ServiceException;

public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;

    String getEURExchangeRate() throws ServiceException;

    void clearUSDCache();

    void clearEURCache();

}
