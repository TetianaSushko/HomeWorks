import java.util.ArrayList;
import java.util.OptionalDouble;
public class Average {
    public Double getAverage(ArrayList<Integer> list){
        OptionalDouble result =  list.stream().mapToInt(value -> value).average();
        return result.getAsDouble();
    }
}
