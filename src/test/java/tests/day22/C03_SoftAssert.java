package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseCross;

public class C03_SoftAssert extends TestBaseCross {
    @Test
    public void test() {
        SoftAssert softAssert = new SoftAssert(); // once obje olusturuyoruz
        driver.get("https://www.amazon.co.jp");
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));  //1
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(searchBox.isDisplayed());  //2
        searchBox.sendKeys("Nutella", Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        softAssert.assertTrue(result.isDisplayed());  //3
        softAssert.assertTrue(result.getText().contains("Nutella"));  //4
        softAssert.assertAll(); // objeyi sonlandiriyoruz

    }
}
