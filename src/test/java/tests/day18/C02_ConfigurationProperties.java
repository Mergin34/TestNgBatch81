package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test(groups = "2")
    public void test() {
        String amazonUrl = ConfigReader.getProperty("amazonUrl");
        String facebookUrl = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(amazonUrl);
        Driver.getDriver().get(facebookUrl);
        Driver.closeDriver();

    }
}
