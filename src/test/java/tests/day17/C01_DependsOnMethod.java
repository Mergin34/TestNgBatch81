package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void yahoo() {
        driver.navigate().to("https://www.hhhyahoo.com"); //<<<----- Hatali url e dikkat!!
    }

    @Test(dependsOnMethods = "yahoo")
    public void google() {
        driver.navigate().to("https://www.google.com");
    }

    @Test(dependsOnMethods = "google")
    public void amazon() {
        driver.navigate().to("https://www.amazon.com");
    }

    @Test(priority = -1)
    public void yandex() {
        driver.navigate().to("https://www.yandex.com");
    }
}
