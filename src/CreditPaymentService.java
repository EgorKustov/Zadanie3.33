public class CreditPaymentService {

    public double calculate(double loanTermInMonths, double amountOfCredit, double loanInterestRate) {
        double loanInterestRatePerMonth = (loanInterestRate / (12 * 100));
        double pow = Math.pow(1 + (loanInterestRatePerMonth), loanTermInMonths);
        return (amountOfCredit * (loanInterestRatePerMonth * pow)) / (pow - 1);
    }
}

