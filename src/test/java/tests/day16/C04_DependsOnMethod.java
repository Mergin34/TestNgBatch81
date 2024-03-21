package tests.day16;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        driver.navigate().to("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @Test(dependsOnMethods = "test2")
    public void resultWords() {
        String expected = "amazon";
        String actual = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
        Assert.assertFalse(actual.contains(expected));
    }
}
