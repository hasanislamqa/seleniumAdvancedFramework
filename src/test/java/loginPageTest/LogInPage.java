package loginPageTest;

import base.ScriptBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LogInPage extends ScriptBase {
LoginController loginController;
    @Test

    public void verifyWebsiteOpen() throws InterruptedException {
        loginController=new LoginController(driver);
        init();
        loginController.signinButton(driver);

    }
    @Test

    public void verifyWebsiteOpen2() throws InterruptedException {


        loginController=new LoginController(driver);
        init();
        loginController.signinButton(driver);




    }
    @AfterTest

    public void aftertest(){

        driver.quit();
    }











}



