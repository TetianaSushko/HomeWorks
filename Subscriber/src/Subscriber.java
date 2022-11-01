public class Subscriber {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String city;
    private String telephoneNumber;
    private  int numberOfContract;
    private double balance;
    private long internalCals;
    private long externalCals;
    private double internetTraffic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getInternalCals() {
        return internalCals;
    }

    public void setInternalCals(long internalCals) {
        this.internalCals = internalCals;
    }

    public long getExternalCals() {
        return externalCals;
    }

    public void setExternalCals(long externalCals) {
        this.externalCals = externalCals;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public Subscriber(int id, String firstName, String middleName, String lastName, String city, String telephoneNumber, int numberOfContract, double balance, long internalCals, long externalCals, double internetTraffic) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.city = city;
        this.telephoneNumber = telephoneNumber;
        this.numberOfContract = numberOfContract;
        this.balance = balance;
        this.internalCals = internalCals;
        this.externalCals = externalCals;
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", numberOfContract=" + numberOfContract +
                ", balance=" + balance +
                ", internalCals=" + internalCals +
                ", externalCals=" + externalCals +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
