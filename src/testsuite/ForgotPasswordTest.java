package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
     driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
     String expectedMessage = "Reset Password";
        //Verify the text " Reset Password"
        WebElement actaulTextMessageElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualMessage = actaulTextMessageElement.getText();
        Assert.assertEquals("Not on Reset Password Page", expectedMessage, actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
