import java.util.Collection;
import java.util.HashSet;

public class CollectionWithoutDuplicates {
    public static <T> Collection<T> removeDuplicatesFromCollection (Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
