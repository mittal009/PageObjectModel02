import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterPage extends Utils
{
    String email = "Ali234alia"+timeStamp()+"@yahoo.com";

    private String timeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        return timeStamp;
    }


    public void verifyUserIsOnRegisterPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on register page");
    }
    public void enterRegistrationDetails()
    {
        waitForClickable(By.name("register-button"), 10);
        clickOnElement(By.linkText("Register"));
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on register page");
        //  driver.findElement(By.id("FirstName")).sendKeys("Alia");
        // type the first name
        typeText(By.id("FirstName"),"Alia");
        // driver.findElement(By.id("LastName")).sendKeys("Ali");//to type the last name
        typeText(By.id("LastName"),"Ali");
        selectByText(By.name("DateOfBirthDay"), "8");
        //to select the date of birthday
        //to select the month of the birth
        selectByText(By.name("DateOfBirthMonth"), "May");
//        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//        selectMonth.selectByIndex(5);
        //to select month of birthday
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByVisibleText("2019");
        //to select year of birth
//        driver.findElement(By.id("Email")).sendKeys("Ali234alia"+timeStamp()+"@yahoo.com");
//        typeText(By.id("Email"), "Ali234alia"+timeStamp()+"@yahoo.com");
        System.out.println(email);
       typeText(By.id("Email"), email);
        //driver.findElement(By.id("Company")).sendKeys("AA Ltd");
        typeText(By.id("Company"),("AA Ltd"));
        //driver.findElement(By.id("Password")).sendKeys("Aali2012@A");
        typeText(By.id("Password"),("Aali2012@A"));
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Aali2012@A");
        typeText(By.id("ConfirmPassword"),("Aali2012@A"));
        //driver.findElement(By.linkText("register-button")).click();
        clickOnElement(By.id("register-button"));

    }

}
