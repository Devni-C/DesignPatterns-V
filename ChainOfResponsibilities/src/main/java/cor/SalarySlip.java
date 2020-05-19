package cor;

public class SalarySlip {
    private int empNo;
    private double amount;
    private double addition;
    private double reviewedRate;
    private boolean permanency;

    protected void setAddion(double addition) {
        this.addition = addition;
    }

    public SalarySlip(int empNo, double amount, double reviewedRate, boolean permanency) {
        this.empNo = empNo;
        this.amount = amount;
        this.reviewedRate = reviewedRate;
        this.permanency = permanency;

    }

    public int getEmpNo() {
        return empNo;
    }

    public double getAmount() {
        return amount;
    }

    public double getAddition() {
        return addition;
    }

    public double getReviewedRate() {
        return reviewedRate;
    }

    public boolean isPermanent() {
        return permanency;
    }
}
