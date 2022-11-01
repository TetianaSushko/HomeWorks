public interface SubscriberService {
    void printSubscribersWithInternalCalsLimit(long internalCals,  Subscriber[] subscribers);
    void printSubscribersWhoUseExternalCals(Subscriber[] subscribers);
    void printTotalConsumptionOfTrafficInCity(String city, Subscriber[] subscribers);
    void printSubscribersByLastNamePrefix(String lastName, Subscriber[] subscribers);
    void printSubscribersWithNegativeBalance(Subscriber[] subscribers);

}
