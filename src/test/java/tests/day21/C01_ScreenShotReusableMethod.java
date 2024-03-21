package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }

    @Test
    public void test2() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        //ReusableMethods.getScreenshotWebElement("searchResults",amazonPage.result);
        // <--Reuseble methotda specific webelement yok.
        Driver.closeDriver();

    }
}
