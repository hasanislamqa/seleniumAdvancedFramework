package loginPageTest;

import base.ScriptBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LogInPage extends ScriptBase {

LoginController loginController;

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
    @Test
    public void verifyMyOrderText(){
        loginController=new LoginController(driver);
        loginController.verifyInformationDesk(driver,"My orders");


    }
    @Test
    public void verifyNewproductsText(){
        loginController=new LoginController(driver);
        loginController.verifyInformationDesk(driver,"New products");


    }
    @Test
    public void verifySitemapText(){
        loginController=new LoginController(driver);
        loginController.verifyInformationDesk(driver,"Sitemap");


    }
    @Test
    public void verifyWomenText(){
        loginController=new LoginController(driver);
        loginController.verifyInformationDesk(driver,"Women");


    }
    @Test
    public void verifySpecialsText(){
        loginController=new LoginController(driver);
        loginController.verifyInformationDesk(driver,"Specials");


    }
    @AfterTest

    public void aftertest(){

        driver.quit();
    }












}



