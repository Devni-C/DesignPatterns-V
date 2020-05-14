package bank;

import java.math.BigDecimal;

public class CurrentAccount extends Account {
    private BigDecimal maxDailyChequeAmount;

    public BigDecimal getMaxDailyChequeAmount() {
        return maxDailyChequeAmount;
    }

    public void setMaxDailyChequeAmount(BigDecimal maxDailyChequeAmount) {
        this.maxDailyChequeAmount = maxDailyChequeAmount;
    }

    @Override
    public String toString() {
        return "Current Account( " +
                "maximum daily cheque withdrawal amount: " + maxDailyChequeAmount +
                " )";
    }
}
