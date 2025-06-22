package forecasting;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000.0;      // ₹10,000
        double annualGrowthRate = 0.05;      // 5%
        int numberOfYears = 10;              // 10 years

        double futureValue = FinancialForecast.forecast(initialAmount, annualGrowthRate, numberOfYears);

        System.out.printf("📈 Predicted Value after %d years: ₹%.2f\n", numberOfYears, futureValue);
    }
}

