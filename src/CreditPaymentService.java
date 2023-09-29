public class CreditPaymentService {

    public double calculate(double loanTermInMonths, double amountOfCredit, double loanInterestRate) {
        double monthlyPayment;
        double pow = Math.pow(1 + (loanInterestRate / (12 * 100)), loanTermInMonths);
        monthlyPayment = (amountOfCredit * ((loanInterestRate / (12 * 100)) * pow)) / (pow - 1);
        return monthlyPayment;
    }
}

