package forecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double principal, double rate, int years) {
        if (years == 0)
            return principal; // base case
        return forecast(principal * (1 + rate), rate, years - 1); // recursive call
    }
}
