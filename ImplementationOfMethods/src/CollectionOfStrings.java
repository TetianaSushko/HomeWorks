import java.util.Arrays;
public class CollectionOfStrings {
    private String[] elements;
    private int DEFAULT_CAPACITY = 10;
    private int size;

    public CollectionOfStrings() {
        elements = new String[DEFAULT_CAPACITY];
    }

    public boolean add(int index, String value) {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        System.arraycopy(elements, index,
                elements, index + 1,
                size - index);
        elements[index] = value;
        size++;
        System.out.println(Arrays.toString(elements));
        return true;
    }

    public boolean add(String value) {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = value;
        size++;
        System.out.println(Arrays.toString(elements));
        return true;
    }

    public boolean delete(int index) {
        int newSize = size - 1;
        System.arraycopy(elements, index + 1, elements, index, newSize - index);
        elements[newSize] = null;
        size--;
        System.out.println(Arrays.toString(elements));
        return true;
    }

    public boolean delete(String value) {
        int indexOfValue = 0;
        for (int i = 0; i < size; i++) {
            if (value != null && value.equals(elements[i])){
                indexOfValue = i;
                break;
            } else if (value == null && elements[i] == null){
                indexOfValue = i;
                break;
            }
        }
        return delete(indexOfValue);
    }
    public String get(int index) {
        String value = elements[index];
        System.out.println(value);
        return value;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
