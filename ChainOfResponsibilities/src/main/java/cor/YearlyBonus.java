package cor;

public class YearlyBonus extends Handler {
    public double applyAddition(SalarySlip salarySlip) {
        salarySlip.setAddion(salarySlip.getAmount() * 0.1);
        System.out.println("Yearly Bonus calculated");

        if(salarySlip.getReviewedRate() > 3.3) {
            return salarySlip.getAddition();
        } else {
            return successor.applyAddition(salarySlip);
        }
    }
}
