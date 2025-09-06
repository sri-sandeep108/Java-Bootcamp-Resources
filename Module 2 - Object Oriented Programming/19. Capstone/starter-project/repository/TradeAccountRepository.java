package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.TradeAccount;

public class TradeAccountRepository {
    private Map<String, TradeAccount> datastore = new HashMap<>();

    public void createTradeAccount(TradeAccount source) {
        datastore.put(source.getId(), source.clone());
    }

    public TradeAccount retrieveTradeAccount(String id) {
        return this.datastore.get(id) == null ? null : this.datastore.get(id).clone();
    }

    public void updateTradeAccount(TradeAccount source) {
        datastore.put(source.getId(), source.clone());
    }

    public void deleteTradeAccount(String id) {
        datastore.remove(id);
    }
}
