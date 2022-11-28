import java.util.List;
import java.util.stream.Collectors;

public class PairList {
public List<Pair> getPair(List<String> list){

    List<Pair> numbers = list.stream()
            .filter(s -> s != null)
            .map(s -> new  Pair(s.toUpperCase(),s.toLowerCase()))
            .collect(Collectors.toList());
    return numbers;
    }
}
