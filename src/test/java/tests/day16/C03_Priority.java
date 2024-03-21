package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    @Test(priority = 1)
    public void testGoogle() {

        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void testYandex() {
        driver.navigate().to("https://www.yandex.com");
    }

    @Test(priority = 2,groups = "1")
    public void testYahoo() {
        driver.navigate().to("https://www.yahoo.com");
    }

    @Test(priority = -1)
    public void testBing() {
        driver.navigate().to("https://www.bing.com");
    }
}
