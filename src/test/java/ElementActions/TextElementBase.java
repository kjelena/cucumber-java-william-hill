/*
 * base class for working with text
 */
package ElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextElementBase extends ElementBase {
    
    public TextElementBase(WebDriver driver) {
        super(driver);
    }
    
    public String GetText(By by) throws Exception{
        WaitUntilElementIsVisible(by);
        WebElement elem = GetLocatedElement(by);
        return elem.getText();
    }
}
