import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CollectionOfStrings collectionOfStrings = new CollectionOfStrings();

        collectionOfStrings.add("A");
        collectionOfStrings.add("B");
        collectionOfStrings.add(null);
        collectionOfStrings.add("C");
        collectionOfStrings.add(1, "D");
        collectionOfStrings.delete (null);
        collectionOfStrings.delete(1);
        collectionOfStrings.get(1);

    }
}
