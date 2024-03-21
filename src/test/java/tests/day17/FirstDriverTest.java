package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class FirstDriverTest {
    @Test
    public void testGoogle() {
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().get("http://www.bing.com ");
        Driver.closeDriver();
        Driver.getDriver().get("http://www.yahoo.com");
        Driver.getDriver().get("http://www.yandex.com");
        Driver.quitDriver();
    }
}
