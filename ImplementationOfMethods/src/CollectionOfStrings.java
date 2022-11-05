import java.util.Arrays;

public class CollectionOfStrings {
    private String[] collection = new String[6];

    public boolean add(int index, String value){
        collection[index] = value;
        return true;
    }
    public boolean add(String value){
        int lastValue = 0;
        for (int i = 0; i <=collection.length -1; i++){
            if (collection[i] != null){
               lastValue = i;
            }
        }
        collection[lastValue+1]= value;
        System.out.println(Arrays.toString(collection));
        return true;
    }

    public boolean delete(int index){
        collection[index] = null;
        System.out.println(Arrays.toString(collection));
        return  true;
    }
    public boolean delete(String value){
      for (int i = 0; i <= collection.length - 1; i++){
          if (value.equals(collection[i])){
              collection[i] = null;
          }
      }
        System.out.println(Arrays.toString(collection));
        return true;
    }
    public String get(int index){
        String value = collection[index];
        System.out.println(value);
       return value;
    }
}
