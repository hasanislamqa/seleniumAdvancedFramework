package homePageTest;

import base.ScriptBase;
import loginPageTest.HomePageController;
import org.testng.annotations.Test;

public class HomePage extends ScriptBase {
    HomePageController homePageController;

    @Test
    public void verifyContactUsButtonDisplayed(){


homePageController=new HomePageController(driver);
homePageController.contactUsButton();

    }
}