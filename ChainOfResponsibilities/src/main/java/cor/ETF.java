package cor;

public class ETF extends Handler {
    public double applyAddition(SalarySlip salarySlip) {
        salarySlip.setAddion(salarySlip.getAmount() * 0.03);
        System.out.println("ETF calculated");

        if(salarySlip.isPermanent()) {
            return salarySlip.getAddition();
        } else {
            return successor.applyAddition(salarySlip);
        }
    }
}
