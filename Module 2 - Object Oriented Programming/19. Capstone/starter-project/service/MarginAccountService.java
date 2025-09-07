package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount temp = retrieveTradeAccount(id);
        repository.updateTradeAccount(new MarginAccount(temp.getId(), temp.getMargin().add(amount)));
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount temp = retrieveTradeAccount(id);
        repository.updateTradeAccount(new MarginAccount(temp.getId(), temp.getMargin().subtract(amount)));
    }

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void createTradeAccount(MarginAccount source) {
        repository.createTradeAccount(source);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount source) {
        repository.updateTradeAccount(source);
    }

    public void deleteTradeAccount(String id) {
        repository.deleteTradeAccount(id);
    }

}