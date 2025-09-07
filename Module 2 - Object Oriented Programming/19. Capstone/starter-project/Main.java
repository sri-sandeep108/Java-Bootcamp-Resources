import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;

public class Main {
    static Path[] paths = new Path[] { Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt") };

    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void main(String[] args) {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
                .map(x -> x.split(" "))
                .forEach(line -> {
                    if (line[0].equals("CASH")) {
                        CashAccount temp = new CashAccount(line[1], new BigDecimal(line[2]));
                        cashAccountService.createTradeAccount(temp);
                    } else if (line[0].equals("MARGIN")) {
                        MarginAccount temp = new MarginAccount(line[1], new BigDecimal(line[2]));
                        marginAccountService.createTradeAccount(temp);
                    }
                });
    }   

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
                .map(x -> x.split(" "))
                .forEach(line -> {
                    if (line[0].equals("CASH")) {
                        if (line[2].equals("DEPOSIT"))
                            cashAccountService.deposit(line[1], new BigDecimal(line[3]));
                        else
                            cashAccountService.withdraw(line[1], new BigDecimal(line[3]));
                    } else if (line[0].equals("MARGIN")) {
                        if (line[2].equals("DEPOSIT"))
                            marginAccountService.deposit(line[1], new BigDecimal(line[3]));
                        else
                            marginAccountService.withdraw(line[1], new BigDecimal(line[3]));
                    }
                });
    }

    public static void finalTest() throws IOException {
        System.out.println(
                "Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println(
                "Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println(
                "Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }
}
