import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CollectionOfStrings collectionOfStrings = new CollectionOfStrings();

        collectionOfStrings.add(1, "abc");
        collectionOfStrings.add(3, "abcdf");
        collectionOfStrings.add("abcd");
        collectionOfStrings.delete(3);
        collectionOfStrings.delete("abc");
        collectionOfStrings.get(4);

    }
}
