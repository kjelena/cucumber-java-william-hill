/*
 * Here we have methods for clickable element only
 */
package ElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ClickElementBase extends ElementBase{
    
    public ClickElementBase(WebDriver driver) {
        super(driver);
    }
    
    public void Click(By by) throws Exception {
        WaitUntilElementIsClickable(by);
        WebElement elem = GetLocatedElement(by);
        elem.click();
    }
    
}
