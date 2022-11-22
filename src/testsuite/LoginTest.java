package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

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

        public void loginTest(){
    //Find the username filed and enter the username
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    //Find the password field and enter the password
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    // Click on Login button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    String expectedMessage = "Dashboard";
    // Get the "Dashboard" text
    WebElement actaulTextMessageElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
    String actualMessage = actaulTextMessageElement.getText();
    Assert.assertEquals(expectedMessage, actualMessage);

}
@After
    public void tearDown(){
        closeBrowser();
}


}
