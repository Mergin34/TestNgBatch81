package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] searchingWords() {
        return new Object[][]{{"java"}, {"selenium"}, {"samsung"}, {"iphone"}};
    }

    @Test(dataProvider = "searchingWords")
    public void test02(String words) {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.searchBox.sendKeys(words, Keys.ENTER);
        String actualWord = amazonPage.result.getText();
        Assert.assertTrue(actualWord.contains(words));
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}
