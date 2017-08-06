package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.DataCheck;

public class TwoTest
{

    @Test
    public void testB()
    {
        Assert.assertTrue(true);
    }

    @Test
    @Category(DataCheck.class)
    public void testC()
    {
        Assert.assertTrue(true);
    }

}
