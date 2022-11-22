import java.util.Arrays;
import java.util.Iterator;

public class CollectionImpl implements Collection, Iterable<String> {

        @Override
        public int size() {
            return size;
        }

        private String[] elements;
        private int DEFAULT_CAPACITY = 10;
        private int size;


        @Override
        public Iterator<String> iterator() {
            Iterator<String> iterator = new Iterator<String>() {
                private int currentIndex = 0;
                @Override
                public boolean hasNext() {
                    return currentIndex < size;
                }
                @Override
                public String next() {
                    return elements[currentIndex++];
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            return iterator;

        }
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
            return true;
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
            return true;
        }

        @Override
        public boolean delete(String o) {
            Integer indexOfValue = null;
            for (int i = 0; i < size; i++) {
                if (o != null && o.equals(elements[i])) {
                    indexOfValue = i;
                    break;
                } else if (o == null && elements[i] == null) {
                    indexOfValue = i;
                    break;
                }else if (indexOfValue == null){
                    return true;
                }
            }
            return delete(indexOfValue);
        }

        public boolean delete(int index) {
            int newSize = size - 1;
            System.arraycopy(elements, index + 1, elements, index, newSize - index);
            elements[newSize] = null;
            size--;
            return true;
        }

        @Override
        public String get(int index) {
            if (index > size - 1){
                throw new RuntimeException("Out of Bound");
            }
            String value = elements[index];
            return value;
        }

        @Override
        public boolean contain(String o) {
            for (int i = 0; i < size; i++) {
                if (o != null && o.equals(elements[i])) {
                    return true;
                } else if (o == null && elements[i] == null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean equals(Collection str) {

            if (str == null || size != str.size() ) {
                return false;
            }
            for (int i = 0; i< size; i++){
                if (get(i) == null && get(i) != str.get(i) ){
                    return false;
                }else if (get(i) != null && !get(i).equals(str.get(i))){
                    return  false;
                }
            }
            return true;
        }

        @Override
        public boolean clear() {
            final Object[] es = elements;
            for (int to = size, i = size = 0; i < to; i++)
                es[i] = null;
            return true;
            }
        }
