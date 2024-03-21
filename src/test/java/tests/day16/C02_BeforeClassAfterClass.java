package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void testGoogle() {
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void testYandex() {
        driver.navigate().to("https://www.yandex.com");
    }

    @Test
    public void testYahoo() {
        driver.navigate().to("https://www.yahoo.com");
    }
}
