import com.company.Triple;
import org.junit.Assert;
import org.junit.Test;

public class TripleTests {

    @Test
    public void tripleTest_shouldSaveValues(){
        // setup
        String stringObj = "left";
        int intObj = 100;
        long longObj = 1000000;

        Triple<String,Integer,Long> tripleObj = new Triple<String, Integer, Long>(stringObj, intObj, longObj);
        // Test
        String leftObj = tripleObj.getLeft();
        int middleObj = tripleObj.getMiddle();
        long rightObj = tripleObj.getRight();

        // Assert
        String expectedLeft = "left";
        int expectedMiddle = 100;
        long expectedRight = 1000000;
        Assert.assertEquals(expectedLeft,leftObj);
        Assert.assertEquals(expectedMiddle,middleObj);
        Assert.assertEquals(expectedRight,rightObj);

    }

    @Test
    public void tripleTest_shouldFailForIncorrectValues(){
        // setup
        String stringObj = "left";
        int intObj = 100;
        long longObj = 1000000;

        Triple<String,Integer,Long> tripleObj = new Triple<String, Integer, Long>(stringObj, intObj, longObj);
        // Test
        String leftObj = tripleObj.getLeft();
        int middleObj = tripleObj.getMiddle();
        long rightObj = tripleObj.getRight();

        // Assert
        String expectedLeft = "right";
        int expectedMiddle = 98654;
        long expectedRight = 34984629;
        Assert.assertNotEquals(expectedLeft,leftObj);
        Assert.assertNotEquals(expectedMiddle,middleObj);
        Assert.assertNotEquals(expectedRight,rightObj);

    }

}

