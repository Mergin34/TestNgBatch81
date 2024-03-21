package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C02_HardAssert extends TestBaseCross {
    @Test
    public void test01() {
        driver.get("https://www.amazon.co.jp");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isDisplayed());
        searchBox.sendKeys("Nutella", Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        Assert.assertTrue(result.isDisplayed());
        Assert.assertTrue(result.getText().contains("Nutella"));
    }
}
