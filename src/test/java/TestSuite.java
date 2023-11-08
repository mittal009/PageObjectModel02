import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    NewRelease newRelease = new NewRelease();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    OrderProcessed orderProcessed = new OrderProcessed();


    @Test
    public void acceptAlertPopUp() {
        //click on search button
        homePage.clickOnSearchButton();
    }

    @Test
    public void voteButtonAlert() {
        //click on vote button
        homePage.clickOnVoteButton();
    }

    @Test
    public void changeCurrency() {
        //select pound currency
        homePage.selectEuroCurrency();
    }

    @Test
    public void clickOnDetailsButton() {
        //click on registration button
        homePage.clickOnRegisterButton();
        // verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered successfully;
        loginPage.clickOnLoginButton();
        loginPage.LoginDetails();
        newRelease.clickOnDetailsButton();
        newRelease.clickOnNewCommentButton();
        newRelease.verifyMessage();
    }
    @Test
    public void orderHasBeenSuccessfullyProcessed()
    {//click on registration button
        homePage.clickOnRegisterButton();
        // verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered successfully;
        loginPage.clickOnLoginButton();
        loginPage.LoginDetails();
        orderProcessed.clickOnAppleMacBookPro13Inch();
        orderProcessed.clickOnAddToCartButton();
        orderProcessed.clickOnIAgree();
        orderProcessed.fillDetails();
    }

}





