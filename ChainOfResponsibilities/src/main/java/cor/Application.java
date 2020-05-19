package cor;

public class Application {
    public static void main(String[] args) {
        EPF epf = new EPF();
        ETF etf = new ETF();
        YearlyBonus yearlyBonus = new YearlyBonus();
        Addition addition = new Addition();

        addition.setSuccessor(epf);
        epf.setSuccessor(etf);
        etf.setSuccessor(yearlyBonus);

        SalarySlip salarySlip = new SalarySlip(1, 20000.0, 3.4, true);
        System.out.println("Employee " + salarySlip.getEmpNo() + " : " + addition.applyAddition(salarySlip));

        SalarySlip salarySlip1 = new SalarySlip(2, 15000.0, 3.5, false);
        System.out.println("Employee " + salarySlip1.getEmpNo() + " : " + addition.applyAddition(salarySlip1));

        SalarySlip salarySlip2 = new SalarySlip(3, 80000.0, 3.0, true);
        System.out.println("Employee " + salarySlip2.getEmpNo() + " : " + addition.applyAddition(salarySlip2));

        SalarySlip salarySlip3 = new SalarySlip(4, 50000.0, 4.1, true);
        System.out.println("Employee " + salarySlip3.getEmpNo() + " : " + addition.applyAddition(salarySlip3));


    }
}
