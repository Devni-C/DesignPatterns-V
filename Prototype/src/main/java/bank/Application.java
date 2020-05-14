package bank;

public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();

        SavingsAccount savingsAccount = (SavingsAccount) registry.getAccount(AccountType.SAVINGS);
        System.out.println("Savings Account: " + savingsAccount);

        savingsAccount.setType("Youth'");
        System.out.println(savingsAccount);

        SavingsAccount savingsAccount1 = (SavingsAccount) registry.getAccount(AccountType.SAVINGS);
        System.out.println("Savings Account: " + savingsAccount1);

        CurrentAccount currentAccount = (CurrentAccount) registry.getAccount(AccountType.CURRENT);
        System.out.println("Current Account: " + currentAccount);



    }
}
