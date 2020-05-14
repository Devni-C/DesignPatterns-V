package bank;

public class SavingsAccount extends Account {
    private String type;
    private int maxDailyATMAmount;

    public int getMaxDailyATMAmount() {
        return maxDailyATMAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxDailyATMAmount(int maxDailyATMAmount) {
        this.maxDailyATMAmount = maxDailyATMAmount;
    }

    @Override
    public String toString() {
        return "Savings Account( " +
                "type: " + type +
                " )";
    }
}
