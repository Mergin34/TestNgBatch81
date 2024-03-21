package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void yandexTest() {
        driver.navigate().to("https://www.yandex.com");
    }

    @Test(groups = "1")
    public void googleTest() {
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void yahooTest() {
        driver.navigate().to("https://www.yahoo.com");
    }
}
