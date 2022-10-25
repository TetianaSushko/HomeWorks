public class OdesaKyiv {
    public static void main(String[] args) {
        double distanceToKyiv = 500;
        double distanceToKO = 180;
        double distanceBetweenZhashkivAndKO = 150;
        double fuelPrice = Double.parseDouble(args[0]);

        Car car = new Car();
        car.setConsumption(7);
        car.setVolumeOfTank(40);
        car.setRemainderOfTank(20);

        double fuelToKyiv = car.fuelToRun(distanceToKyiv);
        double fuelNeedToKyiv = fuelToKyiv - car.getRemainderOfTank();
        double fuelPriseToKyiv = fuelNeedToKyiv * fuelPrice;
        System.out.println("How much liters we need add to get to Kyiv = " + fuelNeedToKyiv + " liters" + "; " +  " What is the price of petrol we need to get Kyiv = " + fuelPriseToKyiv + " UAH");

        double fuelToKO = car.fuelToRun(distanceToKO);
        double fuelRemainderInKO = car.fuelBalance(distanceToKO);
        System.out.println("Fuel remainder in Kruve Ozero = " + fuelRemainderInKO + " liters");
        System.out.println("Fuel we use to run to Kruve Ozero = " + fuelToKO + " liters");
        car.setRemainderOfTank(fuelRemainderInKO);
        double remainderToFullTankInKO = car.toFullTank();
        System.out.println("How much liters we need to add to full tank on the petrol station = " + remainderToFullTankInKO + " liters");

        double fuelFromKOToZhashkiv = car.fuelToRun(distanceBetweenZhashkivAndKO);
        double fuelRemainderInZhashkiv = car.fuelBalance(distanceBetweenZhashkivAndKO);
        System.out.println("Fuel we use to run from Kruve Ozero to Zhashkiv = " + fuelFromKOToZhashkiv + " liters");
        System.out.println("Fuel remainder in Zhashkiv = " + fuelRemainderInZhashkiv + " liters");
        car.setRemainderOfTank(fuelRemainderInZhashkiv);
        double remainderToFullTankInZhashkiv = car.toFullTank();
        System.out.println("How much liters we need to add to full tank on the petrol station " + remainderToFullTankInZhashkiv + " liters");




    }

}
