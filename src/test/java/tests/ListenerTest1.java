package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.Listeners.class)
public class ListenerTest1 {
    @Test
    public void test1() {
        System.out.println("Test Case 1 - Pass");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Test Case 2 - Failed");
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        System.out.println("Test Case 3 - Skipped");
        throw new SkipException("Skip Edilecek");
    }
}
