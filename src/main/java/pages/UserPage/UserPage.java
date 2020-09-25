package pages.UserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class UserPage extends ParentPage {
    public UserPage(WebDriver webDriver) {
        super(webDriver);
    }
//Open User
    @FindBy(xpath = ".//*[text()=' Troian Sasha ']")
    private WebElement troianSasha;
    @FindBy(xpath = ".//*[@href=\'/profile\']")
    private WebElement openUserProfile;
    @FindBy(xpath = ".//*[@href=\'/configs/data\']")
    private WebElement openUserSetings;

}
