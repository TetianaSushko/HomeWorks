public interface CustomCollection {
    boolean add(String str);
    String get(int index);
    int size();
    boolean delete (int index);
    boolean delete (String str);
    boolean clear();
    boolean contains(String str);
    boolean trim();
    boolean addAll(CustomCollection strColl);
    void printElements();
    CustomCollectionImpl.Node getFirst();
    CustomCollectionImpl.Node getLast();

}
