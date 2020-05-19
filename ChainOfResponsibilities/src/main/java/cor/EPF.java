package cor;

public class EPF extends Handler {
    public double applyAddition(SalarySlip salarySlip) {
        salarySlip.setAddion(salarySlip.getAmount() * 0.08 + salarySlip.getAmount() * 0.12);
        System.out.println("EPF calculated");

        if (salarySlip.isPermanent()) {
            return salarySlip.getAddition();
        } else {
            return successor.applyAddition(salarySlip);
        }
    }
}
