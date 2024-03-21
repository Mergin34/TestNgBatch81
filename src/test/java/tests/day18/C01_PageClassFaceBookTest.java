package tests.day18;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {
    @Test
    public void test() {
        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(facebookPage.wrongSignUp.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
