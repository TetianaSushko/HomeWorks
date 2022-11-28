import java.util.List;
import java.util.stream.Collectors;

public class StringInLowerCase {
    public List<String> getString (List<String> list){

        List<String> collect = list.stream().filter(s -> s != null && s.toLowerCase().equals(s) && s.length() == 4).collect(Collectors.toList());
        return collect;
    }
}
