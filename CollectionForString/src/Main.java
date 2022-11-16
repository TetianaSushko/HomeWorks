import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Collection collection = new CollectionImpl();
        Collection collection1 = new CollectionImpl();

            collection.add("A");
            collection.add("B");
            collection.add("C");
            collection.add(null);
            collection.add(1, "D");
        Iterator<String> iterator = collection.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
        }
//            collection.delete("B");
//            collection.get(1);
//            collection.contain("D");
//            collection.size();
//            collection.equals(collection1);
//            collection.clear();
        }
    }
