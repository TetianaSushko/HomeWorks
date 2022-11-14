public class Main {
    public static void main(String[] args) {
        CustomCollection customCollection = new CustomCollectionImpl();
        customCollection.add(null);
        customCollection.add(null);
        customCollection.add("a");
        customCollection.add("b");
        customCollection.add("d");
        customCollection.add("c");
        customCollection.add("e");
        customCollection.add("w");
        customCollection.add(null);
        customCollection.get(2);
        customCollection.delete(2);
        customCollection.delete("w");
        customCollection.contains("c");
        CustomCollection customCollection1 = new CustomCollectionImpl();
        customCollection1.add("k");
        customCollection1.add("l");
        customCollection.addAll(customCollection1);
        customCollection.printElements();
        customCollection.trim();
        customCollection.clear();


        }
  }
