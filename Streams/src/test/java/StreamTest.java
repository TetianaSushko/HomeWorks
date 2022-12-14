import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    @Test
    public void getAverageTest(){
     Average average = new Average();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(67);
        list.add(90);
        list.add(998);
        list.add(63);
        double result = average.getAverage(list);
        Assert.assertEquals(246.8, result, 0.001);
    }

    @Test
    public void getStringInLowerCase(){
    StringInLowerCase stringInLowerCase = new StringInLowerCase();
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("Milk");
        list.add("milk");
        list.add("fork");
        list.add(null);
        List <String> result = stringInLowerCase.getString(list);
        Assert.assertNotNull(result);
        Assert.assertEquals("milk", result.get(0));
        Assert.assertEquals("fork", result.get(1));
    }

    @Test
    public void getPairList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(null);
        PairList pairList = new PairList();
        List<Pair> result = pairList.getPair(list);
        Pair testPair = new Pair("ONE", "one");
        Assert.assertNotNull(result);
        Assert.assertEquals(testPair, result.get(0));
        Pair testPair1 = new Pair("TWO", "two");
        Assert.assertEquals(testPair1, result.get(1));
        Assert.assertEquals("ONE", result.get(0).getToUpperCase());
        Assert.assertEquals("one", result.get(0).getToLowerCase());

    }
}
