import org.junit.Assert;
import org.junit.Test;

public class CollectionTest {

    @Test
    public void sizeTest(){
        Collection collection = new CollectionImpl();
        int result = collection.size();
        Assert.assertEquals(0, result);
    }

    @Test
    public void addStringTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add("a"));
        Assert.assertTrue(collection.add(null));
        Assert.assertEquals(2, collection.size());
        Assert.assertEquals("a", collection.get(0));

    }

    @Test
    public void addIndexStringTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add(0,"a"));
        Assert.assertTrue(collection.add(1, "b"));
        Assert.assertTrue(collection.add(2,null));
        Assert.assertTrue(collection.add(1, "c"));
        Assert.assertEquals(4,collection.size());
        Assert.assertEquals("c", collection.get(1));
    }

    @Test
    public void deleteStringTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add("a"));
        Assert.assertTrue(collection.add("b"));
        Assert.assertTrue(collection.delete("a"));
        Assert.assertTrue(collection.delete("l"));
        Assert.assertEquals(1,collection.size());

    }


    @Test
    public void getIndexTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add("a"));
        Assert.assertTrue(collection.add("b"));
        Assert.assertEquals("a", collection.get(0));
        Assert.assertEquals(2, collection.size());
        Assert.assertEquals("b", collection.get(1));
    }
    @Test(expected = RuntimeException.class)
    public void getIndexOutOfBoundTest(){
        Collection collection = new CollectionImpl();
        collection.get(11);
    }

    @Test
    public void containsTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add("a"));
        Assert.assertTrue(collection.add("b"));
        Assert.assertTrue(collection.contain("b"));
        Assert.assertTrue( collection.contain("a"));
        Assert.assertFalse( collection.contain("c"));
        Assert.assertEquals(2, collection.size());
    }
    @Test
    public void  equalsTest(){
        Collection collection1 = new CollectionImpl();
        Collection collection2 = new CollectionImpl();
        Assert.assertTrue(collection1.add("a"));
        Assert.assertTrue(collection1.add(null));

        Assert.assertTrue(collection2.add("a"));
        Assert.assertTrue(collection2.add(null));
        Assert.assertTrue(collection1.equals(collection2));

    }

    @Test
    public void notEqualsTest(){
        Collection collection1 = new CollectionImpl();
        Collection collection2 = new CollectionImpl();
        Assert.assertTrue(collection1.add("a"));
        Assert.assertTrue(collection1.add(null));

        Assert.assertTrue(collection2.add("a"));
        Assert.assertTrue(collection2.add("b"));
        Assert.assertFalse(collection1.equals(collection2));
    }

    @Test
    public void clearTest(){
        Collection collection = new CollectionImpl();
        Assert.assertTrue(collection.add("a"));
        Assert.assertTrue(collection.add("b"));
        Assert.assertTrue( collection.clear());
        Assert.assertEquals(0, collection.size());
    }
}
