package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class ParentPage {
    WebDriver webDriver;

    Logger logger = Logger.getLogger(getClass());

    public ParentPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }


}
