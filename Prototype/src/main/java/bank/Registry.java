package bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<AccountType, Account> accounts = new HashMap<AccountType, Account>();

    public Registry() {
        this.initialize();
    }

    public Account getAccount(AccountType accountType) {
        Account account = null;
        try {
            account = (Account) accounts.get(accountType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    private void initialize() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setName("18+");
        savingsAccount.setType("Childrens'");
        savingsAccount.setMinAmount(BigDecimal.valueOf(1000));
        savingsAccount.setInterest(BigDecimal.valueOf(5));
        savingsAccount.setMaxDailyATMAmount(100000);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setName("Business");
        currentAccount.setMinAmount(BigDecimal.valueOf(1000));
        currentAccount.setInterest(BigDecimal.valueOf(6.6));
        currentAccount.setMaxDailyChequeAmount(BigDecimal.valueOf(1000000));

        accounts.put(AccountType.SAVINGS, savingsAccount);
        accounts.put(AccountType.CURRENT, currentAccount);
    }
}
