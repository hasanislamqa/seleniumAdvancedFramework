package loginPageTest;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageController {


    @FindBy(xpath = "//*[@id='contact-link']/a")

    WebElement contactusTab;


    public HomePageController(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void contactUsButton(){
        contactusTab.isDisplayed();

    }
}
