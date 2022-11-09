import java.util.Arrays;

public class CollectionImpl implements Collection {
    private String[] elements;
    private int DEFAULT_CAPACITY = 10;
    private int size;

    public CollectionImpl() {
        elements = new String[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(String o) {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = o;
        size++;
        System.out.println(Arrays.toString(elements));
        return false;
    }

    @Override
    public boolean add(int index, String o) {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        System.arraycopy(elements, index,
                elements, index + 1,
                size - index);
        elements[index] = o;
        size++;
        System.out.println(Arrays.toString(elements));
        return false;
    }

    @Override
    public boolean delete(String o) {
        int indexOfValue = 0;
        for (int i = 0; i < size; i++) {
            if (o != null && o.equals(elements[i])) {
                indexOfValue = i;
                break;
            } else if (o == null && elements[i] == null) {
                indexOfValue = i;
                break;
            }
        }
        return delete(indexOfValue);
    }

    public boolean delete(int index) {
        int newSize = size - 1;
        System.arraycopy(elements, index + 1, elements, index, newSize - index);
        elements[newSize] = null;
        size--;
        System.out.println(Arrays.toString(elements));
        return true;
    }

    @Override
    public String get(int index) {
        String value = elements[index];
        System.out.println(value);
        return value;
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (o != null && o.equals(elements[i])) {
                System.out.println("Array contains : " + o);
                return true;
            } else if (o == null && elements[i] == null) {
                System.out.println("Array contains : " + o);
                return true;
            }
        }
        System.out.println("Array not contains : " + o);
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (str == null || size != str.size()) {
            return false;
        }
        for (int i = 0; i< size; i++){
            if (!get(i).equals(str.get(i))){
                return false;
            }
        }
            return true;
    }

    @Override
    public boolean clear() {
        final Object[] es = elements;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
        System.out.println(Arrays.toString(elements));
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
