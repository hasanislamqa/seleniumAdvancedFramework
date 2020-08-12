package loginPageTest;

import base.ScriptBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInPage extends ScriptBase {

LoginController loginController;
@BeforeTest
public void beforeTest(){
    init();
}

    @Test

    public void verifyWebsiteOpen() throws InterruptedException {
        loginController=new LoginController(driver);
        loginController.signinButton(driver);

    }
    @Test

    public void verifyWebsiteOpen2() throws InterruptedException {


        loginController=new LoginController(driver);
        loginController.signinButton(driver);




    }

    @Test
    public void verifyLogIn(){

       loginController=new LoginController(driver);

       loginController.logIn();

    }
    @AfterTest

    public void aftertest(){

        driver.quit();
    }











}



