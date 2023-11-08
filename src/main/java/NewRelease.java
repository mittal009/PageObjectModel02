import org.openqa.selenium.By;
import org.testng.Assert;

public class NewRelease extends Utils
{

    public void clickOnDetailsButton() {
        clickOnElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a"));
        Assert.assertTrue(driver.getCurrentUrl().contains("new-release"), "User is not on new-release page");
        typeText(By.xpath("//input[@id='AddNewComment_CommentTitle']"), "amazing");
        typeText(By.xpath("//textarea[@id='AddNewComment_CommentText']"), "really nice");
    }
    public void clickOnNewCommentButton()
    {
        clickOnElement(By.xpath("//button[@class='button-1 news-item-add-comment-button']"));
    }
    public void verifyMessage()
    {
      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "News comment is successfully added.", "error");
    }
}