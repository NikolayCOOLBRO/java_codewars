package test.kata.listFiltering;

import org.junit.Assert;
import org.junit.Test;
import org.kata.listFiltering.Kata;

import java.util.List;

public class listFilteringTests {
    @Test
    public void listFilter(){
        List<Object> testData = List.of(1, 2, "a", "b");
        var expected = List.of(1, 2);

        var actual = Kata.filterList(testData);

        Assert.assertEquals(expected, actual);
    }
}
