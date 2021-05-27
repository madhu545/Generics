import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ALL")
public class FindMaximumTest {
    @Test
    void givenIntegerValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMax(20,17,3);
        Assertions.assertEquals(result, 20);
    }

    @Test
    void givenIntegerValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMax(2, 11, 7);
        Assertions.assertEquals(result, 11);
    }

    @Test
    void givenIntegerValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMax(2, 11, 17);
        Assertions.assertEquals(result, 17);
    }

    @Test
    void givenDoubleValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMax(20.25, 11.95, 7.32);
        Assertions.assertEquals(result, 20.25);
    }

    @Test
    void givenDoubleValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMax(2.3, 11.77, 7.33);
        Assertions.assertEquals(result, 11.77);
    }

    @Test
    void givenDoubleValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMax(2.55, 11.33, 17.99);
        Assertions.assertEquals(result, 17.99);
    }

    @Test
    void givenStringValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMax("watermelon", "banana", "apple");
        Assertions.assertEquals(result, "watermelon");
    }

    @Test
    void givenStringValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMax("apple", "watermelon", "banana");
        Assertions.assertEquals(result, "watermelon");
    }

    @Test
    void givenStringValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMax("apple", "banana", "watermelon");
        Assertions.assertEquals(result, "watermelon");
    }

    @Test
    void givenValueTestMaximumString() {
        FindMaximum m = new FindMaximum();
        String result = (String) m.testMaximum("apple", "banana", "watermelon");
        Assertions.assertEquals(result, "watermelon");
    }

    @Test
    void givenValueTestMaximumInteger() {
        FindMaximum m = new FindMaximum();
        Integer result = (Integer) m.testMaximum(10,55,22);
        Assertions.assertEquals(result, 55);
    }

    @Test
    void givenValueTestMaximumDouble() {
        FindMaximum m = new FindMaximum();
        Double result = (Double) m.testMaximum(10.30, 55.02, 22.44);
        Assertions.assertEquals(result, 55.02);
    }

    @Test
    void givenValueTestMaximumDoubleArray() {
        FindMaximum m = new FindMaximum();
        Double[] array = {78.55, 33.66, 76.77, 1.0};
        Double result = (Double) m.pritnMultiple(array);
        Assertions.assertEquals(result, 78.55);
    }

    @Test
    void givenValueTestMaximumStringArray() {
        FindMaximum m = new FindMaximum();
        String[] array = {"apple", "banana", "watermelon", "grapes"};
        String result = (String) m.pritnMultiple(array);
        Assertions.assertEquals(result, "watermelon");
    }

    @Test
    void givenValueTestMaximumIntegerArray() {
        FindMaximum m = new FindMaximum();
        Integer[] array = {78, 33, 76, 1};
        Integer result = (Integer) m.pritnMultiple(array);
        Assertions.assertEquals(result, 78);
    }
}
