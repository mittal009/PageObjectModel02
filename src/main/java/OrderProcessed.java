import org.openqa.selenium.By;

public class OrderProcessed extends Utils
{
public void clickOnAppleMacBookPro13Inch()
{
    clickOnElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/h2/a"));
}
public void clickOnAddToCartButton()
{
    clickOnElement(By.xpath("//button[@id='add-to-cart-button-4']"));
    clickOnElement(By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul[1]/li[4]/a[1]"));
}
public void clickOnIAgree()
{
    clickOnElement(By.xpath("//input[@id='termsofservice']"));
    clickOnElement(By.xpath("//button[@id='checkout']"));
}
    public void fillDetails()
    {
        selectByText(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "United Kingdom");
        typeText(By.xpath("//input[@id=\"BillingNewAddress_City\"]"), "dreamland");
        typeText(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]"), "50, fairylane");
        typeText(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "MP23 5KJ");
        typeText(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "07456784755");
        clickOnElement(By.xpath("//button[@onclick=\"Billing.save()\"]"));
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
       clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]"));
        selectByText(By.xpath("//select[@id='CreditCardType']"), "visa");
        typeText(By.xpath("//input[@id='CardholderName']"), "Zoya khan");
        typeText(By.xpath("//input[@id='CardNumber']"), "2345 3434 3434 5656");
        selectByText(By.xpath("//select[@id='ExpireMonth']"), "03");
        selectByText(By.xpath("//select[@id='ExpireYear']"), "2025");
        typeText(By.xpath("//input[@name='CardCode']"), "346");
        clickOnElement(By.xpath("//button[@onclick='PaymentInfo.save()']"));
    }



}


