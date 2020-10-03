package loginPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginController {
    @FindBy(xpath = "//a[@class='login']") WebElement signInTab;

    @FindBy(id = "email") WebElement inputEmail;
    @FindBy(id = "passwd") WebElement inputPasswd;

    @FindBy(css = "#SubmitLogin > span") WebElement logInButton;
    @FindBy(css="span.navigation_page") WebElement authenticationTab;
    @FindBy(xpath = "//a[@title='My orders']") WebElement endPageInfo;
    public LoginController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void signinButton(WebDriver driver){
        //   WebElement element= driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        //  element.isDisplayed();
        // System.out.println("element");
       driver.findElement(By.cssSelector("a.login")).click();
        System.out.println("signin in clicked");
// this new css
    }
    public void logIn() {
        signInTab.click();

     //  Thread.sleep(500);

        authenticationTab.isDisplayed();

        Assert.assertEquals(authenticationTab,authenticationTab);
       // inputEmail.sendKeys("test@gmail.com");
       // inputPasswd.sendKeys("123ertw");
       // logInButton.click();




    }

    public void verifyInformationDesk(WebDriver driver, String information){
        driver.findElement(By.xpath("//a[@title='"+information+"']")).isDisplayed();




    }

}
