public class DepositCalculator {
    public static void main(String[] args) {
        Double amount = Double.parseDouble(args[0]);
        Double rate = Double.parseDouble(args[1]);
        Short duration = Short.parseShort(args[2]);

        for (int i = 0; i < duration; i++){
            Double amountRateForYear = 0.0;
            for (int j = 0; j < 12; j++){
                Double rateForMonth = countRateForMonth(amount, rate);
                amount = amount + rateForMonth;
                amountRateForYear = amountRateForYear + rateForMonth;
            }

            String resultOfRate = String.format("%.2f", amountRateForYear);
            System.out.println("Rate for year = " + resultOfRate + "UAH");

            String resultOfAmount = String.format("%.2f", amount);
            System.out.println("Amount = " + resultOfAmount + " " + "UAH" );
        }
    }
    private static Double countRateForMonth (Double amount, Double rate){
        Double rateForMonth = rate / 12;
        return (amount * rateForMonth) / 100;
    }
}
