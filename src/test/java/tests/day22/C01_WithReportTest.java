package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C01_WithReportTest extends TestBaseReport {
    @Test
    public void test() {
        extentTest=extentReports.createTest("Positive Test", "Gecerli kullanici adi ve password ile giris yapildi");
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentalCar sitesine gidildi");
        BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
        blueRentalCarPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        blueRentalCarPage.emailBox.sendKeys(ConfigReader.getProperty("userEmail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass")).sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici email ve password ile girildi");
        extentTest.info("Ikinci login butonuna basildi");
        String expectedUserName = "robert liva";
        String actualUserName = blueRentalCarPage.successEntryButton.getText();
        Assert.assertEquals(expectedUserName, actualUserName);
        extentTest.pass("Sayfaya basarili bir sekilde girildi");
    }
}
