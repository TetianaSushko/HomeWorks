public class Car {
    private double volumeOfTank;
    private double remainderOfTank;
    private double consumption;

    public double toFullTank() {
        double result = volumeOfTank - remainderOfTank;
        setRemainderOfTank(getVolumeOfTank());
        return result;
    }

    public double fuelBalance(double distance) {
        return remainderOfTank - fuelToRun(distance);
    }

    public double fuelToRun(double distance) {
        return (distance / 100) * getConsumption();
    }

    public double getVolumeOfTank() {
        return volumeOfTank;
    }

    public void setVolumeOfTank(double volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }

    public double getRemainderOfTank() {
        return remainderOfTank;
    }

    public void setRemainderOfTank(double remainderOfTank) {
        this.remainderOfTank = remainderOfTank;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}
