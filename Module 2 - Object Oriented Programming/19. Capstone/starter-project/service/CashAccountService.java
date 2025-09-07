package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount temp = retrieveTradeAccount(id);
        repository.updateTradeAccount(new CashAccount(temp.getId(), temp.getCashBalance().add(amount)));
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount temp = retrieveTradeAccount(id);
        repository.updateTradeAccount(new CashAccount(temp.getId(), temp.getCashBalance().subtract(amount)));
    }

    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void createTradeAccount(CashAccount source) {
        repository.createTradeAccount(source);
    }

    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount source) {
        repository.updateTradeAccount(source);
    }

    public void deleteTradeAccount(String id) {
        repository.deleteTradeAccount(id);
    }

}
