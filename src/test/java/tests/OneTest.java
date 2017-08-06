package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.DataCheck;

@Category(DataCheck.class)
public class OneTest
{

    @Test
    public void testA()
    {
        Assert.assertTrue(true);
    }


}
