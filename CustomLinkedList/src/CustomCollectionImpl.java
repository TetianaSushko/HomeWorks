
public class CustomCollectionImpl implements CustomCollection {
    int size = 0;
    public Node first;
    public Node last;

    public void printElements() {
        Node element = first;
        System.out.println("");
        System.out.print(" " + first.item);
        for (int i = 1; i < size; i++) {
            element = element.next;
            System.out.print(" " + element.item + " ");
        }
    }


    String unlink(Node i) {
        final String element = i.item;
        final Node next = i.next;
        final Node prev = i.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            i.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            i.next = null;
        }
        i.item = null;
        size--;
        return element;
    }
    public static class Node {
        String item;
        Node next;
        Node prev;

        Node(Node prev, String element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public boolean add(String str) {
        final Node l = last;
        final Node newNode = new Node(l, str, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {

        Node firstNew = strColl.getFirst();
        last.next = firstNew;
        firstNew.prev = last;
        last = strColl.getLast();
        size = size + strColl.size();
        return true;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }


    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return "IndexOutOfBoundsException";
        }
        return getNode(index).item;
    }

    public Node getNode(int index) {
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean delete(String str) {
        if (str == null) {
            for (Node i = first; i != null; i = i.next) {
                if (i == null) {
                    unlink(i);
                    return true;
                }
            }
        } else {
            for (Node i = first; i != null; i = i.next) {
                if (str.equals(i.item)) {
                    unlink(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        Node valueToDelete = first;
        for (int i = 0; i < index; i++) {
            valueToDelete = valueToDelete.next;
        }
        unlink(valueToDelete);
        return true;
    }

    @Override
    public boolean clear() {
        first = null;
        last = null;
        size = 0;
        return true;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i) != null && get(i).equals(str)) {
                return true;
            } else if ((get(i) == null && get(i) == str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean trim() {
        Node valueTrim = first;
        int initSize = size;
        for (int i = 0; i < initSize; i++) {


            if (valueTrim != null && valueTrim.item == null) {

                final Node next = valueTrim.next;
                final Node prev = valueTrim.prev;

                if (prev == null) {
                    first = next;
                } else {
                    prev.next = next;
                    valueTrim.prev = null;
                }
                if (next == null) {
                    last = prev;
                } else {
                    next.prev = prev;
                }

                valueTrim.item = null;
                size--;
            }
            valueTrim = valueTrim.next;
        }
        return true;
    }
}
