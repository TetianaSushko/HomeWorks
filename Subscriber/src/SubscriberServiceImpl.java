public class SubscriberServiceImpl implements SubscriberService {
    @Override
    public void printSubscribersWithInternalCalsLimit(long internalCals, Subscriber[] subscribers) {
        System.out.println("Print subscribers with internal cals limit :");
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i].getInternalCals() > internalCals) {
                System.out.println(subscribers[i]);
            }
        }
    }

    @Override
    public void printSubscribersWhoUseExternalCals(Subscriber[] subscribers) {
        System.out.println("Print subscribers who used external cals :");
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i].getExternalCals() > 0) {
                System.out.println(subscribers[i]);
            }
        }
    }

    @Override
    public void printTotalConsumptionOfTrafficInCity(String city, Subscriber[] subscribers) {
        System.out.println("printTotalConsumptionOfTrafficInCity");
        double totalConsumption = 0;
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i].getCity().equals(city)) {
                totalConsumption = totalConsumption + subscribers[i].getInternetTraffic();
            }
        }
        System.out.println(totalConsumption + " GB");
    }

    @Override
    public void printSubscribersByLastNamePrefix(String lastName, Subscriber[] subscribers) {
        System.out.println("Print subscribers by last name prefix :");
        for (int i = 0; i < subscribers.length; i++) {
            Subscriber subscriber = subscribers[i];
            if (subscriber.getLastName().startsWith("Bla")) {
                System.out.println(subscriber.getFirstName() + ", " + subscriber.getMiddleName() + ", " + subscriber.getLastName() + ", " + subscriber.getTelephoneNumber() + ", " + subscriber.getBalance());
            }
        }
    }
    @Override
    public void printSubscribersWithNegativeBalance(Subscriber[] subscribers) {
        System.out.println("Print subscribers with negative balance :");
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i].getBalance() < 0) {
                System.out.println(subscribers[i]);
            }
        }
    }
}

