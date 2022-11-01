public class SubscriberFilter {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber(1, "firstName1", "middleName1", "AlastName1", "Kyiv", "+380681111111", 101, 37.0, 25, 60, 80);
        Subscriber subscriber2 = new Subscriber(2, "firstName2", "middleName2", "BlastName2", "Kyiv", "+380682222222", 102, 105.0, 36, 23, 98);
        Subscriber subscriber3 = new Subscriber(3, "firstName3", "middleName3", "ClastName3", "Lviv", "+380683333333", 234, 237, 78, 108, 150);
        Subscriber subscriber4 = new Subscriber(4, "firstName4", "middleName4", "BlastName4", "Lviv", "+380684444444", 7675, -2, 34, 0, 76);
        Subscriber subscriber5 = new Subscriber(5, "firstName5", "middleName5", "DlastName5", "Kharkiv", "+380685555555", 88888, 1009, 234, 10, 110);
        Subscriber[] subscribers = new Subscriber[]{subscriber1, subscriber2, subscriber3, subscriber4, subscriber5};

        SubscriberService subscriberService = new SubscriberServiceImpl();

        subscriberService.printSubscribersWithInternalCalsLimit(25, subscribers);
        subscriberService.printSubscribersWhoUseExternalCals(subscribers);
        subscriberService.printTotalConsumptionOfTrafficInCity("Kyiv", subscribers);
        subscriberService.printSubscribersByLastNamePrefix("BlastName2",subscribers);
        subscriberService.printSubscribersWithNegativeBalance(subscribers);
    }
}
